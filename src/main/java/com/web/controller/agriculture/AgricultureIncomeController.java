/**
 * 
 */
package com.web.controller.agriculture;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.persistence.model.agriculture.AgricultureIncome;
import com.persistence.model.agriculture.Land;
import com.service.agriculture.IAgricultureIncomeService;
import com.service.agriculture.ILandService;
import com.web.dto.agriculture.AgricultureIncomeDTO;
import com.web.util.AppUtil;
import com.web.util.GenericResponse;
import com.web.util.RequestUtil;


/**
 * @author Shahid
 *
 */

//@RequestMapping("/agricultureIncome")
@Controller
public class AgricultureIncomeController {

    @Autowired
	private MessageSource messages;    
	@Autowired
	IAgricultureIncomeService service;
	@Autowired
	ILandService landService;
	@Autowired
	RequestUtil requestUtil;
	
	@Autowired
	AppUtil appUtil;
	
	private ModelMapper modelMapper = new ModelMapper();

	@RequestMapping(value = "/addAgricultureIncome", method = RequestMethod.POST)
	@ResponseBody
	public GenericResponse addAgricultureIncome(final AgricultureIncomeDTO dto, final HttpServletRequest request){
		try {
//			dto.setDatedStr(appUtil.todayDateStr());
			AgricultureIncome e = modelMapper.map(dto, AgricultureIncome.class);
			e.setUserId(requestUtil.getCurrentUser().getId());
			e.setDated(appUtil.getDateTime(dto.getDatedStr()));
			e.setUpdated(appUtil.getDateTime(dto.getUpdatedStr()));
			//update with land name
			Optional<Land> optional = landService.findById(dto.getLandId());
			if(optional.isPresent()) {
				Land land = optional.get();
				e.setLandId(land.getId());
				e.setLandName(land.getTotalLandUnit()+"-"+land.getLandUnit());
			}

			if(service.save(e).getId()>0)
				return new GenericResponse("Income added successfully");
			else
				return new GenericResponse("Sorry, Your expense not submitted");
		} catch (Exception e) {
			appUtil.le(this.getClass(), e);
			return new GenericResponse(appUtil.NOT_FOUND,messages.getMessage("Sorry, Your expense not submitted", null, request.getLocale()),dto);
		}
	}
	
	@RequestMapping(value = "/getUserAgricultureIncome", method = RequestMethod.GET)
	@ResponseBody
	public GenericResponse getUserAgricultureIncome(final HttpServletRequest request) {
		AgricultureIncomeDTO dto = null;
		try {
			List<AgricultureIncomeDTO> dtos = new ArrayList<>();
			AgricultureIncome agricultureIncome = new AgricultureIncome(requestUtil.getCurrentUser().getId());
			Example<AgricultureIncome> example = Example.of(agricultureIncome);
			List<AgricultureIncome> objs = service.findAll(example);
			if(appUtil.isEmptyOrNull(objs))
				return new GenericResponse(appUtil.NOT_FOUND,messages.getMessage("message.no.data.found", null, request.getLocale()),objs);
			
			for(AgricultureIncome obj: objs) {
				dto = new AgricultureIncomeDTO();
				dto  = modelMapper.map(obj, AgricultureIncomeDTO.class);
				dto.setDatedStr(appUtil.getDateTimeStr(obj.getDated()));
				dto.setUpdatedStr(appUtil.getDateTimeStr(obj.getUpdated()));
				dtos.add(dto);
			}
			return new GenericResponse("SUCCESS",dtos);
		} catch (Exception e) {
			appUtil.le(this.getClass(), e);
			return new GenericResponse(appUtil.ERROR,messages.getMessage("message.system_error"+" : "+e.getCause().toString(), null, request.getLocale()),dto);
		}
	}
	
	@RequestMapping(value = "/deleteAgricultureIncome", method = RequestMethod.POST)
	@ResponseBody
	public GenericResponse deleteDonator( HttpServletRequest request){
		try {
		String ids = request.getParameter("checked");
			if(StringUtils.isEmpty(ids)) 
				return new GenericResponse(appUtil.SUCCESS,messages.getMessage("message.invalid.input", null, request.getLocale()));
				
			String idList[] = ids.split(",");
			for(String id:idList){
				service.deleteById(Long.valueOf(id));
			}
			return new GenericResponse(appUtil.SUCCESS,messages.getMessage("message.delete.success", null, request.getLocale()));
		} catch (Exception e) {
			appUtil.le(this.getClass(), e);
			return new GenericResponse(appUtil.ERROR,messages.getMessage("message.system_error"+" : "+e.getCause().toString(), null, request.getLocale()));
		}
	}

}
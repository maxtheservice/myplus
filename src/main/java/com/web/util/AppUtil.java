/**
 * 
 */
package com.web.util;

import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.persistence.model.Geolocation;
import com.service.IGeoLocationService;

/**
 * @author sabbasi
 *
 */
@Component
public class AppUtil {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(AppUtil.class);
	
	@Autowired
	IGeoLocationService geoLocationService;

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    public static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    public static final DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public static Map<String,String> countryMap=null;


    @NonNull
    public String toJson(@org.springframework.lang.Nullable Object object) {
        try {
            return object == null ? "null" : OBJECT_MAPPER.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> T fromJson(@NonNull String json, @NonNull Type type) {
        JavaType javaType = OBJECT_MAPPER.constructType(type);
        try {
            return OBJECT_MAPPER.readValue(json, javaType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
   	//Get current date time
    public static String todayDateStr() {
        LocalDateTime now = LocalDateTime.now();
        return now.format(AppUtil.dateformatter);
    }

    //Get current date time
    public static String todayDateTimeStr() {
        LocalDateTime now = LocalDateTime.now();
        return now.format(AppUtil.dateTimeFormatter);
    }

    @PostConstruct
    void init() {
    	try {
			List<Geolocation> countries =  geoLocationService.loadCountries();
			if(countries==null)
				return;
			LOGGER.info("Contries fetched "+countries.size());
			countryMap = new HashMap<String, String>();
			countries.forEach(c ->{
				countryMap.put(c.getCountryCode(),c.getCountry());
			});
			LOGGER.info("Contries availabe in map  "+countryMap.size());
    	}catch(Exception e) {
    		e.printStackTrace();
    		LOGGER.info("Contries fetching issues  "+this.getClass().getName()+" : "+e.getCause());
    	}
    }

  
	public boolean isEmptyOrNull( Collection<?> collection ){
		if( collection == null || collection.isEmpty() ){
			return true;
		}
		return false;
	}

	/**
	 * This method returns true of the map is null or is empty.
	 * @param map
	 * @return true | false
	 */
	public boolean isEmptyOrNull( Map<?, ?> map ){
		if( map == null || map.isEmpty() ){
			return true;
		}
		return false;
	}

	/**
	 * This method returns true if the objet is null.
	 * @param object
	 * @return true | false
	 */
	public boolean isEmptyOrNull( Object object ){
		if( object == null ){
			return true;
		}
		return false;
	}

	/**
	 * This method returns true if the input array is null or its length is zero.
	 * @param array
	 * @return true | false
	 */
	public boolean isEmptyOrNull( Object[] array ){
		if( array == null || array.length == 0 ){
			return true;
		}
		return false;
	}

	/**
	 * This method returns true if the input string is null or its length is zero.
	 * @param string
	 * @return true | false
	 */
	public boolean isEmptyOrNull( String string ){
		if( string == null || string.trim().length() == 0 ){
			return true;
		}
		return false;
	}    
   
}
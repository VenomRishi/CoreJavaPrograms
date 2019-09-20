/******************************************************************************
 *  Purpose: json util for json operations.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   20-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.helper;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {
	private static ObjectMapper mapper;
	static {
		mapper = new ObjectMapper();
	}

	/**
	 * Purpose: reading the json file, parse and return the mapped object
	 * 
	 * @param path   path of json file
	 * @param object model class object where we can mapped objects
	 * @return returns the mapped objectg
	 * @throws JsonParseException   throws exception if parsing fails
	 * @throws JsonMappingException throws exception if mapping to model is fails
	 * @throws IOException          throws exception if input output operation fails
	 */
	public static Object readMapper(String path, Object object)
			throws JsonParseException, JsonMappingException, IOException {
		return mapper.readValue(new File(path), object.getClass());

	}

	/**
	 * Purpose: writing the json file
	 * 
	 * @param path   path of json file
	 * @param object model class object where we can mapped objects
	 * @return
	 * @throws JsonParseException   throws exception if parsing fails
	 * @throws JsonMappingException throws exception if mapping to model is fails
	 * @throws IOException          throws exception if input output operation fails
	 */
	public static String writeMapper(String path, Object object)
			throws JsonParseException, JsonMappingException, IOException {
		mapper.writeValue(new File(path), object);
		return "Success writing into file";

	}
}

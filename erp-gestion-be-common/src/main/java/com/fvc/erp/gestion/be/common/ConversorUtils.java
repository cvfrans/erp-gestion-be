package com.fvc.erp.gestion.be.common;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


public class ConversorUtils {

	/**
	 * @param <T>
	 * @param objectFrom
	 *            - Object with values
	 * @param classTo
	 *            - Class of the object to return
	 * @return Converted and Object
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws SecurityException
	 */
	public static <T> T convertToObject(Object objectFrom, Class<T> classTo){

		T t = null;

		if (objectFrom != null) {
				
			try {
				t = classTo.cast( ObjectValidator.validateAndReplaceFields(objectFrom, classTo.newInstance(),
						ConversorUtils.getFieldsObject(classTo.getDeclaredFields())) );
			} catch (InstantiationException | IllegalAccessException | SecurityException e) {
				//throw processCoInputException(Constants.INDEX_ERR_INPUT_UNRECOGNIZED_FIELDS, "");
				e.printStackTrace();
			}
						

		}

		return t;

	}
	
	/**
	 * @param <T>
	 * @param objectFrom
	 *            - Object with values
	 * @param classTo
	 *            - Class of the object to return
	 * @param fields
	 *            - Array with simple and compound attributes            
	 * @return Converted and Object
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws SecurityException
	 * @throws CoException
	 */
	public static <T> T convertToObject(Object objectFrom, Class<T> classTo, String[] fields) {

		T t = null;

		if (objectFrom != null) {

			try {
				t = classTo.cast( ObjectValidator.validateAndReplaceFieldsCompound(
													objectFrom, 
														classTo.newInstance(),
															fields ) 	);
			} catch (InstantiationException | IllegalAccessException | SecurityException e) {
				//throw processCoInputException(Constants.INDEX_ERR_INPUT_UNRECOGNIZED_FIELDS, "");
				e.printStackTrace();
			}

		}

		return t;

	}
	
	/**
	 * @param <T, E>
	 * @param listFrom
	 *            - Object list with values initial 
	 * @param classTo
	 *            - Class of the object to return
	 * @return List<T>
	 * @throws CoException
	 */
	public static <T, E> List<T> convertToList(List<E> listFrom, Class<T> classTo) {
		
		List<T> finalList = null;
		
		for (E objectIni : listFrom) {
			if(finalList == null) finalList = new ArrayList<T>();
			finalList.add( convertToObject(objectIni, classTo) );
		}
		
		return finalList;
		
	}
	
	public static String[] getFieldsObject(Field[] fields) {

		String[] fieldsToString = new String[fields.length];

		for (int i = 0; i < fields.length; i++) {
			fieldsToString[i] = fields[i].getName();
		}

		return fieldsToString;
	}
	
}

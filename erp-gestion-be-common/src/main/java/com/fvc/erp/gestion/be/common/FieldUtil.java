package com.fvc.erp.gestion.be.common;

import java.lang.reflect.Field;

import org.springframework.util.ReflectionUtils;

public class FieldUtil {

	/**
	 * MÃ©todo que devuelve el valor de un determinado campo de una clase
	 * 
	 * @param fieldName
	 * @param object
	 * @return
	 */
	public static Object getFieldValue(String fieldName, Object object){
		 Field field = ReflectionUtils.findField(object.getClass(), fieldName);
		 ReflectionUtils.makeAccessible(field);
		 return ReflectionUtils.getField(field, object);
	}
	
	/**
	 * MÃ©todo que cambia el valor de un determinado campo de una clase
	 * 
	 * @param fieldName
	 * @param ObjectToModify
	 * @param newValue
	 */
	public static void setField(String fieldName,Object ObjectToModify, Object newValue){
		 Field field = ReflectionUtils.findField(ObjectToModify.getClass(), fieldName);
		 ReflectionUtils.makeAccessible(field);
		 ReflectionUtils.setField(field, ObjectToModify, newValue);
	}
}

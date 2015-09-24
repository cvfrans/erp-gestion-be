package com.fvc.erp.gestion.be.common;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

public class ObjectValidator {
	
	
	
	/** Metodo para validar los atributos del objeto ingresados en el arreglo son diferente a nulo y reemplazar
	 * @param objectNew Objeto a validar
	 * @param objecToModify Objeto a modificar
	 * @param fields Arreglo de atributos del objeto a validar
	 * @return Object Objecto con valores validados y reemplazados
	 */
	public static Object validateAndReplaceFields(Object objectNew, Object objecToModify, String[] fields){
		
		if (objecToModify == null) return null;
		
		for (int i=0; i < fields.length;i++){
			
			Object objectField = FieldUtil.getFieldValue(fields[i], objectNew);
			
			if (objectField == null) continue;			
		
			FieldUtil.setField(fields[i], objecToModify, objectField);

		}
		return objecToModify;
	}
	
	/** Metodo para validar los atributos compuestos de tipo clase y  reemplazarlos al objecToModify
	 * @param objectNew Objeto a validar
	 * @param objecToModify Objeto a modificar
	 * @param fields Arreglo de atributos del objeto a validar
	 * @return Object Objecto con valores validados y reemplazados
	 */
	public static Object validateAndReplaceFieldsCompound(Object objectNew, Object objecToModify, String[] fields){
		
		if (objecToModify == null) return null;
			
		List<String> lstCompoundField =  new LinkedList<String>();
		List<String> lstSimpleField =  new LinkedList<String>();
		
		for (String field : fields) {
			if( field.indexOf(Constants.EQUALS_FIELD) > -1 ){
				//Guarda los campos compuestos
				lstCompoundField.add(field);
			}else{
				//Guarda los campos simples
				lstSimpleField.add(field);
			}
		}
		for (String simpleField : lstSimpleField) {
				
				Object objectField = FieldUtil.getFieldValue(simpleField, objectNew);
				
				if (objectField == null) continue;			
			
				FieldUtil.setField(simpleField, objecToModify, objectField);
		}
		
		for (String compoundField : lstCompoundField) {
			
			String leftField = getLeftCompoundField(compoundField);			
			Object fieldValueRight = getFieldValueCompoundRight(objectNew, compoundField);
			
			if (fieldValueRight == null) continue;
			
			FieldUtil.setField(leftField, objecToModify, fieldValueRight);
		}
		
		return objecToModify;
	}
	
	/** Obtiene el nombre atributo del lado izquierdo del campo compuesto 
	 * @param compoundField campo compuesto
	 * @return String
	 */
	public static String getLeftCompoundField(String compoundField){
		String fieldName = compoundField.substring(0, compoundField.indexOf(Constants.EQUALS_FIELD));
		return fieldName.trim();
	}
	
	/** Busca el valor del atributo del lado derecho del campo compuesto
	 * @param objectNew del lado derecho
	 * @param compoundField campo compuesto
	 * @return Object
	 */
	public static Object getFieldValueCompoundRight(Object objectNew, String compoundField){
		
		
		String compoundFieldRight = compoundField.substring( compoundField.indexOf(Constants.EQUALS_FIELD) + 1, compoundField.length() );
		String[] argField = compoundFieldRight.split("\\.");
		String msgField = compoundField;
		Object fieldValue = null;
			
		/* Recorre los atributos de cualquier tipo y obtiene el valor del ultimo */
		for (int i = 0; i < argField.length; i++) {
		
			msgField = argField[i];
			if( fieldValue == null ) {
				fieldValue = FieldUtil.getFieldValue(argField[i], objectNew);
				if( fieldValue == null )	break;
				continue;
			}
			fieldValue = FieldUtil.getFieldValue(argField[i], fieldValue);
			if( fieldValue == null )	break;
		}
			
		if( fieldValue == null ){
			//logger.error("PHOENIX: El atributo " + msgField + " no existe");		
		}
 
		return fieldValue;
	}

}

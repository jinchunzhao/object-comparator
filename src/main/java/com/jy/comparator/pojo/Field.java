package com.jy.comparator.pojo;

/**
 * Attribute object
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-05-16 11:04
 */
public class Field {

    /**
     * The attribute name
     */
    private String fieldName;

    /**
     * Properties of generic
     */
    private Class<?> fieldClazz;

    /**
     * The property value of the first object
     */
    private Object firstVal;

    /**
     * The property value of the second object
     */
    private Object secondVal;

    /**
     * object of generic
     */
    private Class<?> objectClazz;

    public Field() {
    }

    public Field(String fieldName, Class<?> fieldClazz, Object firstVal, Object secondVal, Class<?> objectClazz) {
        this.fieldName = fieldName;
        this.fieldClazz = fieldClazz;
        this.firstVal = firstVal;
        this.secondVal = secondVal;
        this.objectClazz = objectClazz;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Class<?> getFieldClazz() {
        return fieldClazz;
    }

    public void setFieldClazz(Class<?> fieldClazz) {
        this.fieldClazz = fieldClazz;
    }

    public Object getFirstVal() {
        return firstVal;
    }

    public void setFirstVal(Object firstVal) {
        this.firstVal = firstVal;
    }

    public Object getSecondVal() {
        return secondVal;
    }

    public void setSecondVal(Object secondVal) {
        this.secondVal = secondVal;
    }

    public Class<?> getObjectClazz() {
        return objectClazz;
    }

    public void setObjectClazz(Class<?> objectClazz) {
        this.objectClazz = objectClazz;
    }

    @Override public String toString() {
        return "Field{" + "fieldName='" + fieldName + '\'' + ", fieldClazz=" + fieldClazz + ", firstVal=" + firstVal
            + ", secondVal=" + secondVal + ", objectClazz=" + objectClazz + '}';
    }
}

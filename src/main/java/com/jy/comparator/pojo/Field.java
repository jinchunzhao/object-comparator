package com.jy.comparator.pojo;


/**
 * 不同属性
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-05-16 11:04
 */
public class Field {
    /**
     * 属性名称
     */
    private String fieldName;
    /**
     * 属性类型
     */
    private Class<?> fieldType;
    /**
     * 第一个对象的属性值
     */
    private Object firstVal;
    /**
     * 第二个对象的属性值
     */
    private Object secondVal;

    public Field() {
    }

    public Field(String fieldName, Class<?> fieldType, Object firstVal, Object secondVal) {
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.firstVal = firstVal;
        this.secondVal = secondVal;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Class<?> getFieldType() {
        return fieldType;
    }

    public void setFieldType(Class<?> fieldType) {
        this.fieldType = fieldType;
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
}

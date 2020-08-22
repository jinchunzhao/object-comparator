package com.github.jinchunzhao.comparator.factory.base;

import com.github.jinchunzhao.comparator.pojo.Field;

import java.beans.IntrospectionException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Object comparator base abstract class factory
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-08-22 13:20
 */
public abstract class AbstractCompareBaseFactory extends AbstractReadMethodBaseFactory {

    /**
     * Raw data type
     */
    private static final List<Class<?>> WRAPPER = Arrays
        .asList(Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, Character.class,
            Boolean.class, String.class);

    /**
     * An array of raw data types
     */
    private static final List<Class<?>> WRAPPER_ARRAY = Arrays
        .asList(Byte[].class, Short[].class, Integer[].class, Long[].class, Float[].class, Double[].class,
            Character[].class, Boolean[].class, String[].class);

    public AbstractCompareBaseFactory() {
    }

    /**
     * Determine if it is a raw data type
     *
     * @param first  First object
     * @param second Second object
     * @return Basic data type: true/false
     */
    protected boolean isBasicField(Object first, Object second) {
        Object obj = Objects.isNull(first) ? second : first;
        Class<?> clazz = obj.getClass();
        return clazz.isPrimitive() || WRAPPER.contains(clazz);
    }

    /**
     * If the object is of a simple data type, the comparison is made directly
     *
     * @param first  First object
     * @param second Second object
     * @return Different Field information, equal return empty set, different Field name object type name
     */
    protected List<Field> compareBasicField(Object first, Object second) {
        boolean equal = Objects.equals(first, second);
        if (equal) {
            return Collections.emptyList();
        } else {
            Object obj = Objects.isNull(first) ? second : first;
            Class<?> clazz = obj.getClass();
            return Collections.singletonList(new Field(clazz.getSimpleName(), clazz, first, second, null));
        }
    }

    /**
     * Determines if it is an array of the original data type
     *
     * @param first  The property value of the first object
     * @param second The property value of the second object
     * @return Result information: True/false
     */
    protected boolean isBasicArrayField(Object first, Object second) {
        Object obj = Objects.isNull(first) ? second : first;
        Class<?> clazz = obj.getClass();
        return WRAPPER_ARRAY.contains(clazz);
    }

    protected boolean isArrayField(Object first, Object second) {
        Object obj = Objects.isNull(first) ? second : first;
        Class<?> clazz = obj.getClass();
        return clazz.isArray();
    }

    /**
     * Determines if it is an array of the BigDecimal data type
     *
     * @param first  The property value of the first object
     * @param second The property value of the second object
     * @return Result information: True/false
     */
    protected boolean isBigDecimalArrayField(Object first, Object second) {
        Object obj = Objects.isNull(first) ? second : first;
        Class<?> clazz = obj.getClass();
        return clazz.isArray() || Objects.equals(BigDecimal[].class, clazz);
    }

    /**
     * The default is equals (equals) for two objects
     *
     * @param field Currently compares attribute information
     * @return Whether the attributes are equal
     * @throws IntrospectionException
     */
    protected boolean isFieldEquals(Field field) throws IntrospectionException {

        if (field.getFirstVal() instanceof Date) {
            Date first = (Date) field.getFirstVal();
            Date second = (Date) field.getSecondVal();
            if (Objects.equals(first, second)) {
                return true;
            }
            //The date does not hold the number of milliseconds in the database,
            // so special processing is required. When comparing times, the number of milliseconds is ignored
            return Objects.equals(Math.round(first.getTime() / 1000), Math.round(second.getTime() / 1000));
        } else if (field.getFirstVal() instanceof BigDecimal && field.getFirstVal() instanceof BigDecimal) {
            return Objects.deepEquals(field.getFirstVal(), field.getFirstVal());
        }
        return fieldValueEquals(field.getFirstVal(), field.getSecondVal());
    }

    /**
     * Contrast attribute values
     *
     * @param firstVal  The property value of the first object
     * @param secondVal The property value of the second object
     * @return Result information: True/false
     * @throws IntrospectionException
     */
    protected boolean fieldValueEquals(Object firstVal, Object secondVal) throws IntrospectionException {
        if (firstVal instanceof Collection<?> && secondVal instanceof Collection<?>) {
            if (isBasicArrayField(firstVal, secondVal)) {
                return deepEqualsBasicArray(firstVal, secondVal);
            } else if (isBigDecimalArrayField(firstVal, secondVal)) {
                return deepEqualsBasicArray(firstVal, secondVal);
            } else {
                return deepEqualsList(((Collection<?>) firstVal).toArray(), ((Collection<?>) secondVal).toArray());
            }
        } else if (isArrayField(firstVal, secondVal)) {
            return deepEqualsArray(firstVal, secondVal);
        } else if (isBasicField(firstVal, secondVal)) {
            return Objects.deepEquals(firstVal, secondVal);
        } else if (firstVal instanceof Map<?, ?> && secondVal instanceof Map<?, ?>) {
            Map<?, ?> firstValMap = (Map<?, ?>) firstVal;
            Map<?, ?> secondValMap = (Map<?, ?>) secondVal;
            return deepEqualsMap(firstValMap, secondValMap);
        } else {
            //Attributes are comparisons of entity classes
            return equals(firstVal, secondVal);
        }
    }

    /**
     * Depth comparison of primitive type arrays
     *
     * @param firstVal  The property value of the first object
     * @param secondVal The property value of the second object
     * @return Result information: True/false
     */
    protected boolean deepEqualsBasicArray(Object firstVal, Object secondVal) {
        Object[] firstVals = ((Collection<?>) firstVal).toArray();
        Object[] secondVals = ((Collection<?>) secondVal).toArray();
        //Array of primitive type, sort first
        Arrays.sort(firstVals);
        Arrays.sort(secondVals);
        return Objects.deepEquals(firstVals, secondVals);
    }

    /**
     * A generic non-primitive data type in a collection
     *
     * @param a1 The property value of the first object
     * @param a2 The property value of the second object
     * @return Comparison result: True/false
     * @throws IntrospectionException
     */
    protected boolean deepEqualsList(Object[] a1, Object[] a2) throws IntrospectionException {
        if (a1 == a2) {
            return true;
        }
        if (a1 == null || a2 == null) {
            return false;
        }
        int length = a1.length;
        if (a2.length != length) {
            return false;
        }
        //判断集合中是否完全相同，集合存在乱序的情况
        int count = 0;
        for (int index = 0; index < length; index++) {
            Object e1 = a1[index];
            //            for (int i = 0; i < length; i++) {
            Object e2 = a2[index];
            List<Field> diff = getNotSameFields(e1, e2);
            if (diff == null || diff.isEmpty()) {
                count++;
            }
            //            }
        }
        if (count != length) {
            return false;
        }
        return true;

    }

    /**
     * Depth comparison map
     *
     * @param firstValMap  first
     * @param secondValMap second
     * @return Comparison result: True/false
     * @throws IntrospectionException
     */
    protected boolean deepEqualsMap(Map<?, ?> firstValMap, Map<?, ?> secondValMap) throws IntrospectionException {
        if (firstValMap == secondValMap) {
            return true;
        }
        if (firstValMap == null || secondValMap == null) {
            return false;
        }
        if (firstValMap.isEmpty() || secondValMap.isEmpty()) {
            return false;
        }
        int size = firstValMap.size();
        if (secondValMap.size() != size) {
            return false;
        }
        int count = 0;
        for (Map.Entry<?, ?> entry : firstValMap.entrySet()) {
            Object key = entry.getKey();
            Object value1 = entry.getValue();
            if (!secondValMap.containsKey(key)) {
                return false;
            }
            Object value2 = secondValMap.get(key);
            List<Field> diff = getNotSameFields(value1, value2);
            if (diff == null || diff.isEmpty()) {
                count++;
            }
        }
        if (count != size) {
            return false;
        }
        return true;

    }

    /**
     * Depth comparison Array
     *
     * @param firstVal  first
     * @param secondVal second
     * @return Comparison result: True/false
     * @throws IntrospectionException
     */
    protected boolean deepEqualsArray(Object firstVal, Object secondVal) throws IntrospectionException {

        if (firstVal == secondVal) {
            return true;
        }

        if (Objects.isNull(firstVal) || Objects.isNull(secondVal)) {
            return false;
        }

        Object[] firstObjs = (Object[]) firstVal;

        Object[] secondObjs = (Object[]) secondVal;

        if (firstObjs.length == 0 || secondObjs.length == 0) {
            return false;
        }

        int length = firstObjs.length;
        if (secondObjs.length != length) {
            return false;
        }
        //判断集合中是否完全相同，集合存在乱序的情况
        int count = 0;
        for (int index = 0; index < length; index++) {
            Object obj1 = firstObjs[index];
            //            for (int i = 0; i < length; i++) {
            Object obj2 = secondObjs[index];
            List<Field> diff = getNotSameFields(obj1, obj2);
            if (diff == null || diff.isEmpty()) {
                count++;
            }
            //            }
        }
        if (count != length) {
            return false;
        }
        return true;
    }
}

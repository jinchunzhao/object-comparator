package com.jy.comparator.factory;

import com.jy.comparator.factory.base.AbstractCompareBaseFactory;
import com.jy.comparator.pojo.Field;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Gets a collection of attributes with different attribute values, abstract tool class
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-08-22 11:15
 */
public abstract class AbstractDiffFieldFactory extends AbstractCompareBaseFactory {

    public AbstractDiffFieldFactory() {

    }

    @Override public List<Field> getNotSameFields(Object first, Object second) throws IntrospectionException {
        if (Objects.isNull(first) && Objects.isNull(second)) {
            return Collections.emptyList();
        }
        if (isBasicField(first, second)) {
            return compareBasicField(first, second);
        }
        List<Field> diffFields = new LinkedList<>();
        Object obj = Objects.isNull(first) ? second : first;
        Map<String, Method> getters = getReadMethod(obj);
        for (Map.Entry<String, Method> entry : getters.entrySet()) {
            String fieldName = entry.getKey();
            Method method = entry.getValue();
            try {
                boolean equal;
                Object firstVal = Objects.isNull(first) ? null : method.invoke(first);
                Object secondVal = Objects.isNull(second) ? null : method.invoke(second);
                Field field = new Field(fieldName, method.getReturnType(), firstVal, secondVal, obj.getClass());
                equal = isFieldEquals(field);
                if (!equal) {
                    diffFields.add(field);
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new IllegalStateException(
                    "An exception occurred while retrieving attributes for comparison: " + fieldName, e);
            }
        }
        return diffFields;
    }

}

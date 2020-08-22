package com.github.jinchunzhao.comparator.factory.base;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Gets the GET method for an entity class attribute and a collection of attributes with different attribute values
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-05-16 16:51
 */
public abstract class AbstractReadMethodBaseFactory implements CompareFactory {

    /**
     * Gets all getter methods in the entity class
     *
     * @param obj Entity class
     * @return key -> fieldName, value -> getter
     * @throws IntrospectionException
     */
    public Map<String, Method> getReadMethod(Object obj) throws IntrospectionException {
        Map<String, Method> getters = new LinkedHashMap<>(15);
        Class clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            PropertyDescriptor pd = new PropertyDescriptor(fieldName, clazz);
            Method getMethod = pd.getReadMethod();
            getters.put(fieldName, getMethod);
        }
        return getters;
    }

}

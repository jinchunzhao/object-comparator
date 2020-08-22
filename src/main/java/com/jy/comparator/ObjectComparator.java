package com.jy.comparator;

import com.jy.comparator.factory.AbstractEqualFactory;
import com.jy.comparator.pojo.Field;

import java.beans.IntrospectionException;
import java.util.List;

/**
 * An object comparator is an external interface used to determine if two objects are the same
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-08-22 10:38
 */
public class ObjectComparator {

    /**
     * Compare two objects in depth to see if all attribute values are the same
     *
     * @param first  First object
     * @param second Second object
     * @return Comparison results: same: true; False
     * @throws IntrospectionException
     */
    public static boolean equals(Object first, Object second) throws IntrospectionException {
        AbstractEqualFactory baseFactory = AbstractEqualFactory.getInstance();
        return baseFactory.equals(first, second);
    }

    /**
     * Gets an attribute with different values for the same attribute of two objects
     *
     * @param first  First object
     * @param second Second object
     * @return Different attributes: key: attribute name, value: attribute type
     * @throws IntrospectionException
     */
    public static List<Field> getNotSameFields(Object first, Object second) throws IntrospectionException {
        AbstractEqualFactory baseFactory = AbstractEqualFactory.getInstance();
        List<Field> diff = baseFactory.getNotSameFields(first, second);
        return diff;
    }
}

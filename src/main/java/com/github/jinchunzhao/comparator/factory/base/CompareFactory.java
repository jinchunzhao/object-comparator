package com.github.jinchunzhao.comparator.factory.base;

import com.github.jinchunzhao.comparator.pojo.Field;

import java.beans.IntrospectionException;
import java.util.List;

/**
 * Object comparator,
 * used to compare two objects to see if all property values are exactly the same
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-05-16 10:36
 */
public interface CompareFactory {

    /**
     * Whether the property values of two objects are exactly the same
     *
     * @param first  The first object
     * @param second The second object
     * @return Comparison results: same: true; False
     * @throws IntrospectionException
     */
    boolean equals(Object first, Object second) throws IntrospectionException;

    /**
     * Gets a collection of properties with different property values
     *
     * @param first  The first object
     * @param second The second object
     * @return Different attributes: key: attribute name, value: attribute type
     * @throws IntrospectionException
     */
    List<Field> getNotSameFields(Object first, Object second) throws IntrospectionException;

}

package com.jy.comparator.factory.base;

import com.jy.comparator.pojo.Field;

import java.util.List;

/**
 * 对象比对器，用于对比两个对象的所有属性是否完全相等
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-05-16 10:36
 */
public interface CompareFactory {


    /**
     * 两个对象的属性值是否完全相同
     * @param first
     *        对象1
     * @param second
     *        对象2
     * @param clazz
     *        属性是集合，集合中的泛型
     *
     * @return
     *        比较结果：相同-true; 不相同-false
     */
    boolean equals(Object first, Object second, Class<?> clazz);


    /**
     * 获取属性值不相同的属性集合
     *
     * @param first
     *       对象1
     * @param second
     *        对象2
     * @param clazz
     *        泛型
     * @return
     *       不相同的属性：key--属性名， value--属性类型
     */
    List<Field> getNotSameFields(Object first, Object second, Class<?> clazz);

}

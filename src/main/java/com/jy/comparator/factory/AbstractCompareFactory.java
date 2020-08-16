package com.jy.comparator.factory;

import com.jy.comparator.factory.base.CompareFactory;
import com.jy.comparator.pojo.Field;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 对比器抽象类
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-05-16 15:55
 */
public abstract class AbstractCompareFactory implements CompareFactory {
    /**
     * 原始数据类型
     */
    private static final List<Class<?>> WRAPPER = Arrays.asList(Byte.class, Short.class,
            Integer.class, Long.class, Float.class, Double.class, Character.class,
            Boolean.class, String.class);

    /**
     * 原始数据类型数组
     */
    private static final List<Class<?>> WRAPPER_ARRAY = Arrays.asList(Byte[].class, Short[].class,
            Integer[].class, Long[].class, Float[].class, Double[].class, Character[].class,
            Boolean[].class, String[].class);

    /**
     * 排除字段
     */
    private  List<String> excludeFields;

    public AbstractCompareFactory() {
        excludeFields = Collections.emptyList();
    }


    /**
     * 排除某些字段
     *
     * @param excludeFields 排除字段，若为 null 或空集，则不指定
     */
    public AbstractCompareFactory(List<String> excludeFields) {
        this.excludeFields = excludeFields;
    }

    @Override
    public boolean equals(Object first, Object second, Class clazz) {
        List<Field> diff = getNotSameFields(first, second,clazz);
        return diff == null || diff.isEmpty();
    }

}

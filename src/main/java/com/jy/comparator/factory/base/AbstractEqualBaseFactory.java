package com.jy.comparator.factory.base;

import com.jy.comparator.pojo.Field;

import java.util.List;

/**
 * 对比器抽象类
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-05-16 16:15
 */
public abstract class AbstractEqualBaseFactory implements CompareFactory {


    public AbstractEqualBaseFactory() {

    }
    @Override
    public boolean equals(Object first, Object second, Class clazz) {
        List<Field> diff = getNotSameFields(first, second,clazz);
        return diff == null || diff.isEmpty();
    }




}

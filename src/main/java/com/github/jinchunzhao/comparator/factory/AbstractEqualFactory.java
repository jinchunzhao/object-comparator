package com.github.jinchunzhao.comparator.factory;

import com.github.jinchunzhao.comparator.pojo.Field;

import java.beans.IntrospectionException;
import java.util.List;

/**
 * Entity classes are more abstract factories
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-08-22 16:34
 */
public class AbstractEqualFactory extends AbstractDiffFieldFactory {

    public AbstractEqualFactory() {
    }

    private static AbstractEqualFactory INSTANCE = null;

    /**
     * Gets a singleton instance of a class
     *
     * @return Returns a unique instance of a class
     */
    public static AbstractEqualFactory getInstance() {
        if (INSTANCE == null) {
            synchronized (AbstractEqualFactory.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AbstractEqualFactory();
                }
            }
        }
        return INSTANCE;
    }

    @Override public boolean equals(Object first, Object second) throws IntrospectionException {
        List<Field> diff = getNotSameFields(first, second);
        return diff == null || diff.isEmpty();
    }
}

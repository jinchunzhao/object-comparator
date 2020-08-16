package com.jy.comparator.factory.base;

import com.jy.comparator.pojo.Field;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 获取实体类属性的get方法，并获取不相同的属性
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-05-16 16:51
 */
public abstract class AbstractGetterBaseFactory implements CompareFactory{

    private static final String GET = "get";
    private static final String IS = "is";
    private static final String GET_IS = "get|is";
    private static final String GET_CLASS = "getClass";


    @Override
    public List<Field> getNotSameFields(Object first, Object second, Class clazz) {
        if (first == null && second == null) {
            return Collections.emptyList();
        }

        return null;
    }

    /**
     * 获取类中的所有 getter 方法
     *
     * @param clazz
     * @return
     *       key -> fieldName, value -> getter
     */
    private Map<String, Method> getAllGetters(Class<?> clazz) {
        Map<String, Method> getters = new LinkedHashMap<>(30);
        Method[] methods = clazz.getMethods();
        for (Method m : methods) {
            // getter 方法没有参数
            if (m.getParameterTypes().length > 0) {
                continue;
            }
            if (m.getReturnType() == Boolean.class || m.getReturnType() == boolean.class) {
                // 如果返回值是 boolean 则兼容 isXxx 的写法
                if (m.getName().startsWith(IS)) {
                    String fieldName = lowerCase(m.getName().substring(2));
                    getters.put(fieldName, m);
                    continue;
                }
            }
            // 以get开头但排除getClass()方法
            if (m.getName().startsWith(GET) && !GET_CLASS.equals(m.getName())) {
                String fieldName = lowerCase(m.getName().replaceFirst(GET_IS, ""));
                getters.put(fieldName, m);
            }
        }
        return getters;
    }

    /**
     * 来自commons-lang3包的StringUtils
     * 转换字符串--首字母小写
     *
     * @param str
     * @return
     */
    private String lowerCase(final String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return str;
        }
        final int firstCodepoint = str.codePointAt(0);
        final int newCodePoint = Character.toLowerCase(firstCodepoint);
        if (firstCodepoint == newCodePoint) {
            return str;
        }
        final int[] newCodePoints = new int[strLen];
        int outOffset = 0;
        newCodePoints[outOffset++] = newCodePoint;
        for (int inOffset = Character.charCount(firstCodepoint); inOffset < strLen; ) {
            final int codepoint = str.codePointAt(inOffset);
            newCodePoints[outOffset++] = codepoint;
            inOffset += Character.charCount(codepoint);
        }
        return new String(newCodePoints, 0, outOffset);
    }

}

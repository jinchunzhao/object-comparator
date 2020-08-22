package com.github.jinchunzhao.comparator.pojo.mapfieldtype;

import java.util.Map;

/**
 * The test object
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-08-22 15:31
 */
public class Teacher {

    private String name;

    private Map<?, ?> map;

    public Teacher() {
    }

    public Teacher(String name, Map<?, ?> map) {
        this.name = name;
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<?, ?> getMap() {
        return map;
    }

    public void setMap(Map<?, ?> map) {
        this.map = map;
    }

    @Override public String toString() {
        return "Teacher{" + "name='" + name + '\'' + ", map=" + map + '}';
    }
}

package com.github.jinchunzhao.comparator.pojo.basicdatafieldtype;

import java.util.List;

/**
 * The test object
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-08-22 14:01
 */
public class Person {

    private String name;

    private List<String> aliasNames;

    public Person(String name, List<String> aliasNames) {
        this.name = name;
        this.aliasNames = aliasNames;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAliasNames() {
        return aliasNames;
    }

    public void setAliasNames(List<String> aliasNames) {
        this.aliasNames = aliasNames;
    }
}

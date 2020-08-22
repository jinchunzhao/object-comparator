package com.jy.comparator.pojo.collectionfieldtype;

import java.util.Set;

/**
 * The test object
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-08-22 14:13
 */
public class Goods {

    private String name;

    private Set<String> aliasNames;

    public Goods(String name, Set<String> aliasNames) {
        this.name = name;
        this.aliasNames = aliasNames;
    }

    public Goods() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getAliasNames() {
        return aliasNames;
    }

    public void setAliasNames(Set<String> aliasNames) {
        this.aliasNames = aliasNames;
    }

    @Override public String toString() {
        return "Goods{" + "name='" + name + '\'' + ", aliasNames=" + aliasNames + '}';
    }
}

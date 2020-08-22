package com.github.jinchunzhao.comparator.pojo.collectionfieldtype;

import java.util.List;

/**
 * The test object
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-08-17 14:36
 */
public class Category {

    private String name;

    private List<Goods> goodList;

    public Category(String name, List<Goods> goodList) {
        this.name = name;
        this.goodList = goodList;
    }

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Goods> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<Goods> goodList) {
        this.goodList = goodList;
    }
}

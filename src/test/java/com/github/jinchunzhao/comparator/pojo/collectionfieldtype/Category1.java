package com.github.jinchunzhao.comparator.pojo.collectionfieldtype;

import java.util.Set;

/**
 * The test object
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-08-17 14:36
 */
public class Category1 {

    private String name;

    private Set<Goods> goodsSet;

    public Category1(String name, Set<Goods> goodsSet) {
        this.name = name;
        this.goodsSet = goodsSet;
    }

    public Category1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Goods> getGoodsSet() {
        return goodsSet;
    }

    public void setGoodsSet(Set<Goods> goodsSet) {
        this.goodsSet = goodsSet;
    }
}

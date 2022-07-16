package com.github.jinchunzhao.comparator.collectionfieldtype.collection;

import com.github.jinchunzhao.comparator.pojo.collectionfieldtype.Category1;
import com.github.jinchunzhao.comparator.pojo.collectionfieldtype.Goods;
import io.github.jinchunzhao.comparator.ObjectComparator;
import io.github.jinchunzhao.comparator.pojo.Field;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ObjectComparator Tester.
 *
 * @author jcz
 * @version 1.0
 * @since <pre>08/22/2020</pre>
 */
public class setFieldTest {

//    ObjectComparator ObjectComparator;

    @Before public void before() throws Exception {
//        ObjectComparator = new ObjectComparator();
    }

    @After public void after() throws Exception {
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals() throws Exception {
        System.out.println("***********************start********************");
        Set<String> aliasNames = new HashSet<>();
        aliasNames.add("Lucy");
        aliasNames.add("Jack");
        Goods goods = new Goods("Tom", aliasNames);

        Set<String> aliasNames1 = new HashSet<>();
        aliasNames1.add("Lucy");
        aliasNames1.add("Jack");
        Goods goods1 = new Goods("Tom", aliasNames1);

        Set<Goods> goodList = new HashSet<>();
        goodList.add(goods);
        goodList.add(goods1);

        Category1 category = new Category1("phone",goodList);


        Set<String> aliasNames2 = new HashSet<>();
        aliasNames2.add("Lucy");
        aliasNames2.add("Jack");
        Goods goods2 = new Goods("Tom", aliasNames2);

        Set<String> aliasNames3 = new HashSet<>();
        aliasNames3.add("Lucy");
        aliasNames3.add("Jack");
        Goods goods3 = new Goods("Tom", aliasNames3);

        Set<Goods> goodList1 = new HashSet<>();
        goodList1.add(goods2);
        goodList1.add(goods3);

        Category1 category1 = new Category1("phone",goodList1);


        boolean equals = ObjectComparator.equals(category, category1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(category, category1);
        System.out.println(notSameFields.toString());

        System.out.println("************All the same***********end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals1() throws Exception {
        System.out.println("***********************start********************");
        Set<String> aliasNames = new HashSet<>();
        aliasNames.add("Lucy");
        aliasNames.add("Jack");
        Goods goods = new Goods("Tom", aliasNames);

        Set<String> aliasNames1 = new HashSet<>();
        aliasNames1.add("Lucy");
        aliasNames1.add("Jack");
        Goods goods1 = new Goods("Tom", aliasNames1);

        Set<Goods> goodList = new HashSet<>();
        goodList.add(goods);
        goodList.add(goods1);

        Category1 category = new Category1("phone",goodList);


        Set<String> aliasNames2 = new HashSet<>();
        aliasNames2.add("Lucy");
        aliasNames2.add("Jack");
        Goods goods2 = new Goods("Tom", aliasNames2);

        Set<String> aliasNames3 = new HashSet<>();
        aliasNames3.add("Lucy");
        aliasNames3.add("Jack");
        Goods goods3 = new Goods("Tom", aliasNames3);

        Set<Goods> goodList1 = new HashSet<>();
        goodList1.add(goods2);
        goodList1.add(goods3);

        Category1 category1 = new Category1("Mobile",goodList1);


        boolean equals = ObjectComparator.equals(category, category1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(category, category1);
        System.out.println(notSameFields.toString());

        System.out.println("************String property values are different***********end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals2() throws Exception {
        System.out.println("***********************start********************");
        Set<String> aliasNames = new HashSet<>();
        aliasNames.add("Lucy");
        aliasNames.add("Jack");
        Goods goods = new Goods("Tom", aliasNames);

        Set<String> aliasNames1 = new HashSet<>();
        aliasNames1.add("Lucy");
        aliasNames1.add("Jack");
        Goods goods1 = new Goods("Tom", aliasNames1);

        Set<Goods> goodList = new HashSet<>();
        goodList.add(goods);
        goodList.add(goods1);

        Category1 category = new Category1("phone",goodList);


        Set<String> aliasNames2 = new HashSet<>();
        aliasNames2.add("Anne");
        aliasNames2.add("Jack");
        Goods goods2 = new Goods("Tom", aliasNames2);

        Set<String> aliasNames3 = new HashSet<>();
        aliasNames3.add("Lucy");
        aliasNames3.add("Jack");
        Goods goods3 = new Goods("Tom", aliasNames3);

        Set<Goods> goodList1 = new HashSet<>();
        goodList1.add(goods2);
        goodList1.add(goods3);

        Category1 category1 = new Category1("phone",goodList1);


        boolean equals = ObjectComparator.equals(category, category1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(category, category1);
        System.out.println(notSameFields.toString());

        System.out.println(
            "************List collection type attribute values are not the same***********end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals3() throws Exception {
        System.out.println("***********************start********************");

        Set<String> aliasNames = new HashSet<>();
        aliasNames.add("Lucy");
        aliasNames.add("Jack");
        Goods goods = new Goods("Tom", aliasNames);

        Set<String> aliasNames1 = new HashSet<>();
        aliasNames1.add("Lucy");
        aliasNames1.add("Jack");
        Goods goods1 = new Goods("Tom", aliasNames1);

        Set<Goods> goodList = new HashSet<>();
        goodList.add(goods);
        goodList.add(goods1);

        Category1 category = new Category1("phone",goodList);


        Set<String> aliasNames2 = new HashSet<>();
        aliasNames2.add("Lucy");
        aliasNames2.add("Jack");
        Goods goods2 = new Goods("Tom", aliasNames2);

        Set<String> aliasNames3 = new HashSet<>();
        aliasNames3.add("Anne");
        aliasNames3.add("Jack");
        Goods goods3 = new Goods("Tom", aliasNames3);

        Set<Goods> goodList1 = new HashSet<>();
        goodList1.add(goods2);
        goodList1.add(goods3);

        Category1 category1 = new Category1("Mobile",goodList1);


        boolean equals = ObjectComparator.equals(category, category1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(category, category1);
        System.out.println(notSameFields.toString());


        System.out.println("************All different***********end********************");
        System.out.println();
    }
}

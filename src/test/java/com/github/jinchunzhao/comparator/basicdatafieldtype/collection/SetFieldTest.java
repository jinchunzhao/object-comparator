package com.github.jinchunzhao.comparator.basicdatafieldtype.collection;

import io.github.jinchunzhao.comparator.ObjectComparator;
import io.github.jinchunzhao.comparator.pojo.Field;
import com.github.jinchunzhao.comparator.pojo.collectionfieldtype.Goods;
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
public class SetFieldTest {

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
        boolean equals = ObjectComparator.equals(goods, goods1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(goods, goods1);
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
        Goods goods1 = new Goods("Tom1", aliasNames1);
        boolean equals = ObjectComparator.equals(goods, goods1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(goods, goods1);
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
        aliasNames.add("Anne");
        Goods goods1 = new Goods("Tom", aliasNames1);
        boolean equals = ObjectComparator.equals(goods, goods1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(goods, goods1);
        System.out.println(notSameFields.toString());

        System.out.println(
            "************Set collection type attribute values are not the same***********end********************");
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
        aliasNames1.add("Tom");
        Goods goods1 = new Goods("Jack", aliasNames1);
        boolean equals = ObjectComparator.equals(goods, goods1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(goods, goods1);
        System.out.println(notSameFields.toString());

        System.out.println("************All different***********end********************");
        System.out.println();
    }
}

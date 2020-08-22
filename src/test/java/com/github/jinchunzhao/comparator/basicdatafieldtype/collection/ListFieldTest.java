package com.github.jinchunzhao.comparator.basicdatafieldtype.collection;

import com.github.jinchunzhao.comparator.ObjectComparator;
import com.github.jinchunzhao.comparator.pojo.Field;
import com.github.jinchunzhao.comparator.pojo.basicdatafieldtype.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * ObjectComparator Tester.
 *
 * @author jcz
 * @version 1.0
 * @since <pre>08/22/2020</pre>
 */
public class ListFieldTest {

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
        List<String> aliasNames = Arrays.asList("Lucy", "Jack");
        Person person = new Person("Tom", aliasNames);

        List<String> aliasNames1 = Arrays.asList("Lucy", "Jack");
        Person person1 = new Person("Tom", aliasNames1);
        boolean equals = ObjectComparator.equals(person, person1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(person, person1);
        System.out.println(notSameFields.toString());

        System.out.println("************All the same***********end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals1() throws Exception {
        System.out.println("***********************start********************");
        List<String> aliasNames = Arrays.asList("Lucy", "Jack");
        Person person = new Person("Tom", aliasNames);

        List<String> aliasNames1 = Arrays.asList("Lucy", "Jack");
        Person person1 = new Person("Tom1", aliasNames1);
        boolean equals = ObjectComparator.equals(person, person1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(person, person1);
        System.out.println(notSameFields.toString());

        System.out.println("************String property values are different***********end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals2() throws Exception {
        System.out.println("***********************start********************");
        List<String> aliasNames = Arrays.asList("Lucy", "Jack");
        Person person = new Person("Tom", aliasNames);

        List<String> aliasNames1 = Arrays.asList("Lucy", "Jack", "Anne");
        Person person1 = new Person("Tom", aliasNames1);
        boolean equals = ObjectComparator.equals(person, person1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(person, person1);
        System.out.println(notSameFields.toString());

        System.out.println("************List property values are different***********end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals3() throws Exception {
        System.out.println("***********************start********************");
        List<String> aliasNames = Arrays.asList("Lucy", "Jack");
        Person person = new Person("Tom", aliasNames);

        List<String> aliasNames1 = Arrays.asList("Tom", "Jack", "Anne");
        Person person1 = new Person("Lucy", aliasNames1);
        boolean equals = ObjectComparator.equals(person, person1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(person, person1);
        System.out.println(notSameFields.toString());

        System.out.println("************All different***********end********************");
        System.out.println();
    }
}

package io.github.jinchunzhao.comparator.entityfieldtype;

import io.github.jinchunzhao.comparator.pojo.basicdatafieldtype.Person;
import io.github.jinchunzhao.comparator.pojo.entityfieldtype.Admin;
import io.github.jinchunzhao.comparator.ObjectComparator;
import io.github.jinchunzhao.comparator.pojo.Field;
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
public class EntityFieldTest {

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
        //属性是实体类时，对象比较器有bug

        System.out.println("***********************start********************");
        List<String> aliasNames = Arrays.asList("Lucy", "Jack");
        Person person = new Person("Tom", aliasNames);

        Admin admin = new Admin("super",person);

        List<String> aliasNames1 = Arrays.asList("Lucy", "Jack");
        Person person1 = new Person("Tom", aliasNames1);

        Admin admin1 = new Admin("super",person1);
        boolean equals = ObjectComparator.equals(admin, admin1);
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

        Admin admin = new Admin("super",person);

        List<String> aliasNames1 = Arrays.asList("Lucy", "Jack");
        Person person1 = new Person("Tom", aliasNames1);

        Admin admin1 = new Admin("ordinary",person1);
        boolean equals = ObjectComparator.equals(admin, admin1);
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

        Admin admin = new Admin("super",person);

        List<String> aliasNames1 = Arrays.asList("Lucy", "Jack");
        Person person1 = new Person("Anne", aliasNames1);

        Admin admin1 = new Admin("super",person1);
        boolean equals = ObjectComparator.equals(admin, admin1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(person, person1);
        System.out.println(notSameFields.toString());

        System.out.println("************entity property values are different***********end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals3() throws Exception {
        System.out.println("***********************start********************");
        List<String> aliasNames = Arrays.asList("Lucy", "Jack");
        Person person = new Person("Tom", aliasNames);

        Admin admin = new Admin("super",person);

        List<String> aliasNames1 = Arrays.asList("Anne", "Jack");
        Person person1 = new Person("Tom", aliasNames1);

        Admin admin1 = new Admin("super",person1);
        boolean equals = ObjectComparator.equals(admin, admin1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(person, person1);
        System.out.println(notSameFields.toString());

        System.out.println("************entity property values are different***********end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals4() throws Exception {

        System.out.println("***********************start********************");
        List<String> aliasNames = Arrays.asList("Lucy", "Jack");
        Person person = new Person("Tom", aliasNames);

        Admin admin = new Admin("super",person);

        List<String> aliasNames1 = Arrays.asList("Anne", "Jack");
        Person person1 = new Person("Anne", aliasNames1);

        Admin admin1 = new Admin("ordinary",person1);
        boolean equals = ObjectComparator.equals(admin, admin1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(person, person1);
        System.out.println(notSameFields.toString());

        System.out.println("************All different***********end********************");
        System.out.println();
    }
}

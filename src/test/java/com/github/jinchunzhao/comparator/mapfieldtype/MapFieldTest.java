package com.github.jinchunzhao.comparator.mapfieldtype;

import com.github.jinchunzhao.comparator.pojo.mapfieldtype.Student;
import com.github.jinchunzhao.comparator.pojo.mapfieldtype.Teacher;
import com.github.jinchunzhao.comparator.ObjectComparator;
import com.github.jinchunzhao.comparator.pojo.Field;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ObjectComparator Tester.
 *
 * @author jcz
 * @version 1.0
 * @since <pre>08/22/2020</pre>
 */
public class MapFieldTest {


    @Before public void before() throws Exception {
    }

    @After public void after() throws Exception {
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals() throws Exception {
        //属性是实体类时，对象比较器有bug

        System.out.println("***********************start********************");

        Map<String, Student> map = new HashMap<>();
        Student stu1 = new Student("Tom",12);
        Student stu2 = new Student("Lucy",13);
        Student stu3 = new Student("Jack",14);
        map.put("Tom",stu1);map.put("Lucy",stu2);map.put("Jack",stu3);

        Teacher teacher = new Teacher("LI",map);


        Map<String, Student> map1 = new HashMap<>();
        Student stu4 = new Student("Lucy",13);
        Student stu5 = new Student("Jack",14);
        Student stu6 = new Student("Tom",12);
        map1.put("Lucy",stu4);map1.put("Jack",stu5);map1.put("Tom",stu6);

        Teacher teacher1 = new Teacher("LI",map1);

        boolean equals = ObjectComparator.equals(teacher, teacher1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(teacher, teacher1);
        System.out.println(notSameFields.toString());

        System.out.println("************All the same***********end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals1() throws Exception {
        System.out.println("***********************start********************");

        Map<String, Student> map = new HashMap<>();
        Student stu1 = new Student("Tom",12);
        Student stu2 = new Student("Lucy",13);
        Student stu3 = new Student("Jack",14);
        map.put("Tom",stu1);map.put("Lucy",stu2);map.put("Jack",stu3);

        Teacher teacher = new Teacher("LI",map);


        Map<String, Student> map1 = new HashMap<>();
        Student stu4 = new Student("Lucy",13);
        Student stu5 = new Student("Jack",14);
        Student stu6 = new Student("Tom",12);
        map1.put("Lucy",stu4);map1.put("Jack",stu5);map1.put("Tom",stu6);

        Teacher teacher1 = new Teacher("HU",map1);

        boolean equals = ObjectComparator.equals(teacher, teacher1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(teacher, teacher1);
        System.out.println(notSameFields.toString());

        System.out.println("************String property values are different***********end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals2() throws Exception {
        System.out.println("***********************start********************");
        Map<String, Student> map = new HashMap<>();
        Student stu1 = new Student("Tom1",12);
        Student stu2 = new Student("Lucy",13);
        Student stu3 = new Student("Jack",14);
        map.put("Tom",stu1);map.put("Lucy",stu2);map.put("Jack",stu3);

        Teacher teacher = new Teacher("LI",map);


        Map<String, Student> map1 = new HashMap<>();
        Student stu4 = new Student("Lucy",13);
        Student stu5 = new Student("Jack",14);
        Student stu6 = new Student("Tom",12);
        map1.put("Lucy",stu4);map1.put("Jack",stu5);map1.put("Tom",stu6);

        Teacher teacher1 = new Teacher("LI",map1);

        boolean equals = ObjectComparator.equals(teacher, teacher1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(teacher, teacher1);
        System.out.println(notSameFields.toString());

        System.out.println("************Map entity property values are different***********end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals3() throws Exception {
        System.out.println("***********************start********************");
        Map<String, Student> map = new HashMap<>();
        Student stu1 = new Student("Tom",12);
        Student stu2 = new Student("Lucy",13);
        Student stu3 = new Student("Jack",14);
        map.put("Tom",stu1);map.put("Lucy",stu2);map.put("Jack",stu3);

        Teacher teacher = new Teacher("LI",map);


        Map<String, Student> map1 = new HashMap<>();
        Student stu4 = new Student("Lucy",13);
        Student stu5 = new Student("Jack",14);
        Student stu6 = new Student("Tom",12);
        map1.put("Lucy",stu4);map1.put("Jack",stu5);map1.put("Tom1",stu6);

        Teacher teacher1 = new Teacher("LI",map1);

        boolean equals = ObjectComparator.equals(teacher, teacher1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(teacher, teacher1);
        System.out.println(notSameFields.toString());

        System.out.println("************map key property values are different***********end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals4() throws Exception {

        System.out.println("***********************start********************");
        Map<String, Student> map = new HashMap<>();
        Student stu1 = new Student("Tom1",12);
        Student stu2 = new Student("Lucy",13);
        Student stu3 = new Student("Jack",14);
        map.put("Tom",stu1);map.put("Lucy",stu2);map.put("Jack",stu3);

        Teacher teacher = new Teacher("LI",map);


        Map<String, Student> map1 = new HashMap<>();
        Student stu4 = new Student("Lucy",13);
        Student stu5 = new Student("Jack",14);
        Student stu6 = new Student("Tom",12);
        map1.put("Lucy",stu4);map1.put("Jack",stu5);map1.put("Tom",stu6);

        Teacher teacher1 = new Teacher("HU",map1);

        boolean equals = ObjectComparator.equals(teacher, teacher1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(teacher, teacher1);
        System.out.println(notSameFields.toString());

        System.out.println("************All different***********end********************");
        System.out.println();
    }
}

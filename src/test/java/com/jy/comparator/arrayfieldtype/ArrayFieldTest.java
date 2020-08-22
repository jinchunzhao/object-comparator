package com.jy.comparator.arrayfieldtype;

import com.jy.comparator.ObjectComparator;
import com.jy.comparator.pojo.Field;
import com.jy.comparator.pojo.arrayfieldType.Teacher1;
import com.jy.comparator.pojo.mapfieldtype.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * ObjectComparator Tester.
 *
 * @author jcz
 * @version 1.0
 * @since <pre>08/22/2020</pre>
 */
public class ArrayFieldTest {


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

        Student[] students = new Student[3];
        Student stu1 = new Student("Tom",12);
        Student stu2 = new Student("Lucy",13);
        Student stu3 = new Student("Jack",14);
        students[0] = stu1;students[1] = stu2;students[2] = stu3;
        String[] strs = {"a","b","c"};
        Teacher1 teacher = new Teacher1("LI",students,strs);


        Student[] students1 = new Student[3];
        Student stu4 = new Student("Tom",12);
        Student stu5 = new Student("Lucy",13);
        Student stu6 = new Student("Jack",14);
        students1[0] = stu4;students1[1] = stu5;students1[2] = stu6;
        String[] strs1 = {"a","b","c"};
        Teacher1 teacher1 = new Teacher1("LI",students1,strs1);

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

        Student[] students = new Student[3];
        Student stu1 = new Student("Tom",12);
        Student stu2 = new Student("Lucy",13);
        Student stu3 = new Student("Jack",14);
        students[0] = stu1;students[1] = stu2;students[2] = stu3;

        String[] strs = {"a","b","c"};
        Teacher1 teacher = new Teacher1("LI",students,strs);


        Student[] students1 = new Student[3];
        Student stu4 = new Student("Tom",12);
        Student stu5 = new Student("Lucy",13);
        Student stu6 = new Student("Jack",14);
        students1[0] = stu4;students1[1] = stu5;students1[2] = stu6;
        String[] strs1 = {"a","b","c"};
        Teacher1 teacher1 = new Teacher1("HU",students1,strs1);

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
        Student[] students = new Student[3];
        Student stu1 = new Student("Tom",12);
        Student stu2 = new Student("Lucy",13);
        Student stu3 = new Student("Jack",14);
        students[0] = stu1;students[1] = stu2;students[2] = stu3;
        String[] strs = {"a","b","c"};
        Teacher1 teacher = new Teacher1("LI",students,strs);


        Student[] students1 = new Student[3];
        Student stu4 = new Student("Lucy",13);
        Student stu5 = new Student("Tom",12);
        Student stu6 = new Student("Jack",14);
        students1[0] = stu4;students1[1] = stu5;students1[2] = stu6;
        String[] strs1 = {"a","b","c"};
        Teacher1 teacher1 = new Teacher1("LI",students1,strs1);

        boolean equals = ObjectComparator.equals(teacher, teacher1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(teacher, teacher1);
        System.out.println(notSameFields.toString());

        System.out.println("************entity array entity property values are different***********end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals3() throws Exception {
        System.out.println("***********************start********************");
        Student[] students = new Student[3];
        Student stu1 = new Student("Tom",12);
        Student stu2 = new Student("Lucy",13);
        Student stu3 = new Student("Jack",14);
        students[0] = stu1;students[1] = stu2;students[2] = stu3;

        String[] strs = {"a","b","c"};

        Teacher1 teacher = new Teacher1("LI",students,strs);


        Student[] students1 = new Student[3];
        Student stu4 = new Student("Lucy",13);
        Student stu5 = new Student("Tom",12);
        Student stu6 = new Student("Jack",14);
        students1[0] = stu4;students1[1] = stu5;students1[2] = stu6;
        String[] strs1 = {"a","b","d"};

        Teacher1 teacher1 = new Teacher1("HU",students1,strs1);

        boolean equals = ObjectComparator.equals(teacher, teacher1);
        System.out.println(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(teacher, teacher1);
        System.out.println(notSameFields.toString());

        System.out.println("************All different***********end********************");
        System.out.println();
    }
}

package com.github.jinchunzhao.comparator.basicdatafieldtype;

import com.github.jinchunzhao.comparator.ObjectComparator;
import com.github.jinchunzhao.comparator.pojo.Field;
import com.github.jinchunzhao.comparator.pojo.basicdatafieldtype.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

/**
 * ObjectComparator Tester.
 *
 * @author jcz
 * @version 1.0
 * @since <pre>08/22/2020</pre>
 */
public class BasicDataTypeFieldTest {

//    ObjectComparator objectComparator;

    @Before public void before() throws Exception {
//        objectComparator = new ObjectComparator();
    }

    @After public void after() throws Exception {
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals() throws Exception {
        System.out.println("***********************start********************");
        //TODO: Test goes here...
        User user = new User();
        user.setAge(10);
        user.setIsDisabled(true);
        user.setGender('1');
        user.setId(123456L);
        user.setMoney(12.2);
        BigDecimal money1 = new BigDecimal(12.34);
        user.setMoney1(money1);
        user.setMoney2(12.45F);
        byte status = 1;
        user.setStatus(status);
        user.setUserName("Tom");
        User user1 = new User();

        user1.setAge(10);
        user1.setIsDisabled(true);
        user1.setGender('1');
        user1.setId(123456L);
        user1.setMoney(12.2);
        BigDecimal money2 = new BigDecimal(12.34);
        user1.setMoney1(money2);
        user1.setMoney2(12.45F);
        byte status1 = 1;
        user1.setStatus(status1);
        user1.setUserName("Tom");
        boolean equals = ObjectComparator.equals(user, user1);
        System.out.println(equals);
        Assert.assertTrue(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(user, user1);
        System.out.println(notSameFields.toString());

        System.out.println("************All the same***********end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals1() throws Exception {
        //TODO: Test goes here...
        System.out.println("***********************start********************");

        User user = new User();
        user.setAge(10);
        user.setIsDisabled(true);
        user.setGender('1');
        user.setId(123456L);
        user.setMoney(12.2);
        BigDecimal money1 = new BigDecimal(12.34);
        user.setMoney1(money1);
        user.setMoney2(12.45F);
        byte status = 1;
        user.setStatus(status);
        user.setUserName("Tom");
        User user1 = new User();

        user1.setAge(10);
        user1.setIsDisabled(true);
        user1.setGender('1');
        user1.setId(123456L);
        user1.setMoney(12.2);
        BigDecimal money2 = new BigDecimal(12.34);
        user1.setMoney1(money2);
        user1.setMoney2(12.45F);
        byte status1 = 1;
        user1.setStatus(status1);
        user1.setUserName("Tom1");
        boolean equals = ObjectComparator.equals(user, user1);
        System.out.println(equals);
        Assert.assertFalse(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(user, user1);
        System.out.println(notSameFields.toString());

        System.out.println("******The String types are different*****************end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals2() throws Exception {
        //TODO: Test goes here...

        System.out.println("***********************start********************");
        User user = new User();
        user.setAge(10);
        user.setIsDisabled(true);
        user.setGender('1');
        user.setId(123456L);
        user.setMoney(12.2);
        BigDecimal money1 = new BigDecimal(12.34);
        user.setMoney1(money1);
        user.setMoney2(12.45F);
        byte status = 1;
        user.setStatus(status);
        user.setUserName("Tom");
        User user1 = new User();

        user1.setAge(20);
        user1.setIsDisabled(true);
        user1.setGender('1');
        user1.setId(123456L);
        user1.setMoney(12.2);
        BigDecimal money2 = new BigDecimal(12.34);
        user1.setMoney1(money2);
        user1.setMoney2(12.45F);
        byte status1 = 1;
        user1.setStatus(status1);
        user1.setUserName("Tom");
        boolean equals = ObjectComparator.equals(user, user1);
        System.out.println(equals);
        Assert.assertFalse(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(user, user1);
        System.out.println(notSameFields.toString());

        System.out.println("*******The Integer types are different****************end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals3() throws Exception {
        //TODO: Test goes here...

        System.out.println("***********************start********************");
        User user = new User();
        user.setAge(10);
        user.setIsDisabled(true);
        user.setGender('1');
        user.setId(123456L);
        user.setMoney(12.2);
        BigDecimal money1 = new BigDecimal(12.34);
        user.setMoney1(money1);
        user.setMoney2(12.45F);
        byte status = 1;
        user.setStatus(status);
        user.setUserName("Tom");
        User user1 = new User();

        user1.setAge(10);
        user1.setIsDisabled(true);
        user1.setGender('0');
        user1.setId(123456L);
        user1.setMoney(12.2);
        BigDecimal money2 = new BigDecimal(12.34);
        user1.setMoney1(money2);
        user1.setMoney2(12.45F);
        byte status1 = 1;
        user1.setStatus(status1);
        user1.setUserName("Tom");
        boolean equals = ObjectComparator.equals(user, user1);
        System.out.println(equals);
        Assert.assertFalse(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(user, user1);
        System.out.println(notSameFields.toString());

        System.out.println("********The Character types are different***************end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals4() throws Exception {
        //TODO: Test goes here...

        System.out.println("***********************start********************");
        User user = new User();
        user.setAge(10);
        user.setIsDisabled(true);
        user.setGender('1');
        user.setId(123456L);
        user.setMoney(12.2);
        BigDecimal money1 = new BigDecimal(12.34);
        user.setMoney1(money1);
        user.setMoney2(12.45F);
        byte status = 1;
        user.setStatus(status);
        user.setUserName("Tom");
        User user1 = new User();

        user1.setAge(10);
        user1.setIsDisabled(true);
        user1.setGender('1');
        user1.setId(1234567L);
        user1.setMoney(12.2);
        BigDecimal money2 = new BigDecimal(12.34);
        user1.setMoney1(money2);
        user1.setMoney2(12.45F);
        byte status1 = 1;
        user1.setStatus(status1);
        user1.setUserName("Tom");
        boolean equals = ObjectComparator.equals(user, user1);
        System.out.println(equals);
        Assert.assertFalse(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(user, user1);
        System.out.println(notSameFields.toString());

        System.out.println("*********The Long types are different**************end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals5() throws Exception {
        //TODO: Test goes here...

        System.out.println("***********************start********************");
        User user = new User();
        user.setAge(10);
        user.setIsDisabled(true);
        user.setGender('1');
        user.setId(123456L);
        user.setMoney(12.2);
        BigDecimal money1 = new BigDecimal(12.34);
        user.setMoney1(money1);
        user.setMoney2(12.45F);
        byte status = 1;
        user.setStatus(status);
        user.setUserName("Tom");
        User user1 = new User();

        user1.setAge(10);
        user1.setIsDisabled(true);
        user1.setGender('1');
        user1.setId(123456L);
        user1.setMoney(14.2);
        BigDecimal money2 = new BigDecimal(12.34);
        user1.setMoney1(money2);
        user1.setMoney2(12.45F);
        byte status1 = 1;
        user1.setStatus(status1);
        user1.setUserName("Tom");
        boolean equals = ObjectComparator.equals(user, user1);
        System.out.println(equals);
        Assert.assertFalse(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(user, user1);
        System.out.println(notSameFields.toString());

        System.out.println("*********The Double types are different**************end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals6() throws Exception {
        //TODO: Test goes here...
        System.out.println("***********************start********************");
        User user = new User();
        user.setAge(10);
        user.setIsDisabled(true);
        user.setGender('1');
        user.setId(123456L);
        user.setMoney(12.2);
        BigDecimal money1 = new BigDecimal(12.34);
        user.setMoney1(money1);
        user.setMoney2(12.45F);
        byte status = 1;
        user.setStatus(status);
        user.setUserName("Tom");
        User user1 = new User();

        user1.setAge(10);
        user1.setIsDisabled(true);
        user1.setGender('1');
        user1.setId(123456L);
        user1.setMoney(12.2);
        BigDecimal money2 = new BigDecimal(15.34);
        user1.setMoney1(money2);
        user1.setMoney2(12.45F);
        byte status1 = 1;
        user1.setStatus(status1);
        user1.setUserName("Tom");
        boolean equals = ObjectComparator.equals(user, user1);
        System.out.println(equals);
        Assert.assertFalse(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(user, user1);
        System.out.println(notSameFields.toString());

        System.out.println("**********The BigDecimal types are different*************end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals7() throws Exception {
        //TODO: Test goes here...
        System.out.println("***********************start********************");
        User user = new User();
        user.setAge(10);
        user.setIsDisabled(true);
        user.setGender('1');
        user.setId(123456L);
        user.setMoney(12.2);
        BigDecimal money1 = new BigDecimal(12.34);
        user.setMoney1(money1);
        user.setMoney2(12.45F);
        byte status = 1;
        user.setStatus(status);
        user.setUserName("Tom");
        User user1 = new User();

        user1.setAge(10);
        user1.setIsDisabled(true);
        user1.setGender('1');
        user1.setId(123456L);
        user1.setMoney(12.2);
        BigDecimal money2 = new BigDecimal(12.34);
        user1.setMoney1(money2);
        user1.setMoney2(18.45F);
        byte status1 = 1;
        user1.setStatus(status1);
        user1.setUserName("Tom");
        boolean equals = ObjectComparator.equals(user, user1);
        System.out.println(equals);
        Assert.assertFalse(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(user, user1);
        System.out.println(notSameFields.toString());

        System.out.println("********The Float types are different***************end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals8() throws Exception {
        //TODO: Test goes here...
        System.out.println("***********************start********************");
        User user = new User();
        user.setAge(10);
        user.setIsDisabled(true);
        user.setGender('1');
        user.setId(123456L);
        user.setMoney(12.2);
        BigDecimal money1 = new BigDecimal(12.34);
        user.setMoney1(money1);
        user.setMoney2(12.45F);
        byte status = 1;
        user.setStatus(status);
        user.setUserName("Tom");
        User user1 = new User();

        user1.setAge(10);
        user1.setIsDisabled(true);
        user1.setGender('1');
        user1.setId(123456L);
        user1.setMoney(12.2);
        BigDecimal money2 = new BigDecimal(12.34);
        user1.setMoney1(money2);
        user1.setMoney2(12.45F);
        byte status1 = 0;
        user1.setStatus(status1);
        user1.setUserName("Tom");
        boolean equals = ObjectComparator.equals(user, user1);
        System.out.println(equals);
        Assert.assertFalse(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(user, user1);
        System.out.println(notSameFields.toString());

        System.out.println("************The Byte types are different***********end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals9() throws Exception {
        //TODO: Test goes here...
        System.out.println("***********************start********************");
        User user = new User();
        user.setAge(10);
        user.setIsDisabled(true);
        user.setGender('1');
        user.setId(123456L);
        user.setMoney(12.2);
        BigDecimal money1 = new BigDecimal(12.34);
        user.setMoney1(money1);
        user.setMoney2(12.45F);
        byte status = 1;
        user.setStatus(status);
        user.setUserName("Tom");
        User user1 = new User();

        user1.setAge(10);
        user1.setIsDisabled(false);
        user1.setGender('1');
        user1.setId(123456L);
        user1.setMoney(12.2);
        BigDecimal money2 = new BigDecimal(12.34);
        user1.setMoney1(money2);
        user1.setMoney2(12.45F);
        byte status1 = 1;
        user1.setStatus(status1);
        user1.setUserName("Tom");
        boolean equals = ObjectComparator.equals(user, user1);
        System.out.println(equals);
        Assert.assertFalse(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(user, user1);
        System.out.println(notSameFields.toString());

        System.out.println("************The Boolean types are different***********end********************");
        System.out.println();
    }

    /**
     * Method: equals(Object first, Object second, Class clazz)
     */
    @Test public void testEquals10() throws Exception {
        //TODO: Test goes here...
        System.out.println("***********************start********************");
        User user = new User();
        user.setAge(10);
        user.setIsDisabled(true);
        user.setGender('1');
        user.setId(123456L);
        user.setMoney(12.2);
        BigDecimal money1 = new BigDecimal(12.34);
        user.setMoney1(money1);
        user.setMoney2(12.45F);
        byte status = 1;
        user.setStatus(status);
        user.setUserName("Tom");
        User user1 = new User();

        user1.setAge(21);
        user1.setIsDisabled(false);
        user1.setGender('0');
        user1.setId(123456789L);
        user1.setMoney(120.21);
        BigDecimal money2 = new BigDecimal(112.345);
        user1.setMoney1(money2);
        user1.setMoney2(132.456F);
        byte status1 = 0;
        user1.setStatus(status1);
        user1.setUserName("Lucy");
        boolean equals = ObjectComparator.equals(user, user1);
        System.out.println(equals);
        Assert.assertFalse(equals);
        List<Field> notSameFields = ObjectComparator.getNotSameFields(user, user1);
        System.out.println(notSameFields.toString());

        System.out.println("*****************All different******end********************");
        System.out.println();
    }

}

package com.github.jinchunzhao.comparator.pojo.entityfieldtype;

import com.github.jinchunzhao.comparator.pojo.basicdatafieldtype.Person;

/**
 * The test object
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-08-17 15:24
 */
public class Admin {

    private String realName;

    private Person person;

    public Admin(String realName, Person person) {
        this.realName = realName;
        this.person = person;
    }

    public Admin() {
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

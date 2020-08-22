package com.github.jinchunzhao.comparator.pojo.mapfieldtype;

/**
 * The test object
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-08-22 15:34
 */
public class Student {

    private String stuName;

    private Integer stuAge;

    public Student() {
    }

    public Student(String stuName, Integer stuAge) {
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    @Override public String toString() {
        return "Student{" + "stuName='" + stuName + '\'' + ", stuAge=" + stuAge + '}';
    }
}

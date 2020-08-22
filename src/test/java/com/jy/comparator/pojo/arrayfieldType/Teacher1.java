package com.jy.comparator.pojo.arrayfieldType;

import com.jy.comparator.pojo.mapfieldtype.Student;

import java.util.Arrays;

/**
 * The test object
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-08-22 15:31
 */
public class Teacher1 {

    private String name;

    private Student[] students;

    private String[] strings;

    public Teacher1() {
    }

    public Teacher1(String name, Student[] students, String[] strings) {
        this.name = name;
        this.students = students;
        this.strings = strings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    @Override public String toString() {
        return "Teacher1{" + "name='" + name + '\'' + ", students=" + Arrays.toString(students) + ", strings=" + Arrays
            .toString(strings) + '}';
    }
}

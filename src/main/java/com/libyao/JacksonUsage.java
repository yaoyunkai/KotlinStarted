package com.libyao;

import java.nio.charset.Charset;

public class JacksonUsage {

    public static void useJackson() {
        Student student = new Student();

        Class cls = new Class();

        cls.level = 7;
        cls.name = "七年级";

        student.age = 18;
        student.name = "小明";
        student.gender = 1;
        student.cls = cls;

        System.out.println(student);
        System.out.println(Charset.defaultCharset().displayName());

        // // reuse
        // ObjectMapper mapper = new ObjectMapper();
        // try {
        //     mapper.writeValue(new File("result.json"), student);
        // } catch (IOException e) {
        //     throw new RuntimeException(e);
        // }

    }
}


class Student {
    public int age;
    public String name;
    public int gender;  // 0 unknown, 1 - man , 2 - women

    public Class cls;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", cls=" + cls +
                '}';
    }
}


class Class {
    public int level;

    public String name;

    @Override
    public String toString() {
        return "Class{" +
                "level=" + level +
                ", name='" + name + '\'' +
                '}';
    }
}

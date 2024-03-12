package com.libyao;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

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

        ObjectMapper mapper = new ObjectMapper();

        // try {
        //     BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("stu.json"), StandardCharsets.UTF_8));
        //     mapper.writeValue(writer, student);
        // } catch (IOException e) {
        //     throw new RuntimeException(e);
        // }

        Student stu2;
        try {
            stu2 = mapper.readValue(new File("stu.json"), Student.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(stu2);

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
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        String uniqCourse;
        Student student1 = new Student("Evgeniy Kuzmin", Arrays.asList("math", "physics", "biology"));
        Student student2 = new Student("Ivan Ivanov",  Arrays.asList("math", "physics", "chemistry"));
        Student student3 = new Student("Petr Petrov",  Arrays.asList("math", "chemistry"));
        Student student4 = new Student("Vasiliy Vasilev",  Arrays.asList("physics", "chemistry"));

        ArrayList <Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
//-------------------------------------------------------------------------------
        List <Student> result2 = students.stream()
                .filter(s -> s.getCourses().size() >= 3)
                .collect(Collectors.toList());

        System.out.println(result2);
//-------------------------------------------------------------------------------
        uniqCourse = "biology";
        List <Student> result3 = students.stream()
                .filter(s -> s.getCourses().contains(uniqCourse))
                .collect(Collectors.toList());

        System.out.println(result3);

    }

}


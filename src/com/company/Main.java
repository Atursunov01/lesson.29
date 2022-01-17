package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {



    public static void main(String[] args) {
	// write your code here
//        Set<String>set = new HashSet<String>();
//        set.add("Tursunov");
//        set.add("nuriddin uulu");
//        set.add("japarov");
//        set.stream().forEach(x -> System.out.println(x));

        Student student = new Student();
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student(1,"tursunov"));
        arr.add(new Student(1,"tursunov"));
        arr.add(new Student(1,"tursunov"));
        arr.stream().map(Student::getFamilia).map(x ->x + x).forEach(x -> System.out.println(x));
    }
}

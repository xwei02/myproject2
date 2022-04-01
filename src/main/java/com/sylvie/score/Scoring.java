package com.sylvie.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        List<Student> scores = new ArrayList<>();
        scores.add(new Student("Jack", 40, 64));
        Student jack = new Student( "Jack", 40, 64);
        Student sylvie =new Student("Sylvie", 80, 70);
        GraduateStudent jane =
                new GraduateStudent("Jane", 64, 70, 85);
        jack.print();
        sylvie.print();
        jane.print();
    }
}

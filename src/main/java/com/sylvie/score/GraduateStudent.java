package com.sylvie.score;

public class GraduateStudent extends Student implements Printable{
    int thesis;

    public GraduateStudent(String name, int english, int maths, int thesis) {
        /*this.name = name;
        this.english = english;
        this.maths = maths;*/
        super(name, english, maths);
        this.thesis = thesis;
    }
    @Override
    public void print() {
        System.out.print(name + "\t" + english + "\t" + maths +
                "\t" + getAverage() + "\t" +thesis);

    }

}

package com.sylvie;

public class Student {
    String name;
    int english;
    int maths;
    public Student(String name){
        this.name = name;
    }
    public Student(String name, int english, int maths){
        this.name =name;
        this.english = english;
        this.maths = maths;
    }
    public Student(){
        this("John Doe", -1, -1);
        /*this.name = John Doe;
        english = -1
        maths = -1 */


    }
    public void print(){
        int average = (english+maths)/2;
        System.out.print(name + "\t" + english + "\t" +
                maths + "\t" + average);
        if (average<60){
            System.out.print("*");
        }
        System.out.println();
    }
}

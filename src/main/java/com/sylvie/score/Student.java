package com.sylvie.score;

//修飾字(子) Modifier public/default(same package)/private/protected(子)
public class Student implements Printable{
    protected String name;
    protected int english;
    protected int maths;
    public Student(String name){
        this.name = name;
    }
    public Student(String name, int english, int maths){
        //this.name =name;
        this(name);
        this.english = english;
        this.maths = maths;
    }
    public Student(){
        this("John Doe", -1, -1);
        /*this.name = John Doe;
        english = -1
        maths = -1 */


    }
    @Override
    public void print(){
        int average = (english+maths)/2;
        System.out.print(name + "\t" + english + "\t" +
                maths + "\t" + average);
        if (average<60){
            System.out.print("*");
        }
        System.out.println();
    }

    public int getAverage() {
        return((english+maths)/2);
    }
}

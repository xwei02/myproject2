package com.sylvie;

public class NormalCustomer {
    String name;
    int money;
    float off = 0.1f;
    public NormalCustomer(String name){this.name = name;}
    public NormalCustomer(String name, int money){
        this(name);
        this.money = money;
    }
    public  float backMoney(){
        return ((money/1000)*off*1000);
    }
    public  void  print(){
       // float offMoney = (money/1000)*off*1000;
        System.out.println(name + "\t" + money + "\t" +(money-backMoney()));
    }
    //public float getOffMoney(){return((money/1000)*off*1000);}

}

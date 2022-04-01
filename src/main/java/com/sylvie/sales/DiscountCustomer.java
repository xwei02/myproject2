package com.sylvie.sales;

public class DiscountCustomer extends NormalCustomer {
    public DiscountCustomer(String name, int money) {
        super(name, money);
        off = 0.1f;
    }

    public  float offMoney(){
        return ((money/1000)*off*1000);
    }
    public  void  print(){
         float offMoney = (money/1000)*off*1000;
        System.out.println(name + "\t" + money + "\t" +(money-offMoney()));
    }

}

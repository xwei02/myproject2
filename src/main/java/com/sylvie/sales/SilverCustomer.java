package com.sylvie.sales;

public class SilverCustomer extends NormalCustomer{
    int GiveMoney;
    public SilverCustomer(String name, int money){
        super(name, money);
    }
    @Override
    public  void  print(){
        System.out.println(name+ "\t" + money + "\t" + (money - backMoney())+"("+backMoney()+")");

    }
}

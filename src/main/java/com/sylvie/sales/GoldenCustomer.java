package com.sylvie.sales;

public class GoldenCustomer extends SilverCustomer{
    public GoldenCustomer(String name, int money){
        super(name, money);
        off = 0.2f;

    }
}

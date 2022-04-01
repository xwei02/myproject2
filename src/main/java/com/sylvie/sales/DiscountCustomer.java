package com.sylvie.sales;

public class DiscountCustomer extends NormalCustomer {
    public DiscountCustomer(String name, int money) {
        super(name, money);
    }

    @Override
    public float backMoney() {
        return money * off;
    }
}

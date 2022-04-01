package com.sylvie.sales;
//一般客戶 - 滿千送百
//銀級客戶 - 滿千送百, 再送百元還原金
//金級客戶 - 滿千送二百, 再送二百還原金
//added after:
//customer get 10% off discount and 20% point
//customer get 30% off
//0001 1200 1100
//0002  800  800
//0003 2000 1800(200) <--銀級客戶
//0004 5000 4000(1000)<--金級會員

public class Customer {
    public static void main(String[] args) {
        NormalCustomer c1 = new NormalCustomer("0001", 1200);
        NormalCustomer c2 = new NormalCustomer("0002", 800);
        SilverCustomer c3 = new SilverCustomer("0003", 2000);
        GoldenCustomer c4 = new GoldenCustomer("0004", 5000);
        DiscountCustomer c5 = new DiscountCustomer("0006", 900);

        c1.print();
        c2.print();
        c3.print();
        c4.print();
        c5.print();
    }
}

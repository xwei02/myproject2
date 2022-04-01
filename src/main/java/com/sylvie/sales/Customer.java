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
//0005 900  810(90)<--Discount會員
/*
  父類別的參照資料,子類別所產生的物件
 */

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public static void main(String[] args) {
        List<NormalCustomer> customers = new ArrayList<>();
        customers.add(new NormalCustomer("0001", 1200));
        customers.add(new NormalCustomer("0002",1200));
        customers.add(new SilverCustomer("0003", 2000));
        customers.add(new GoldenCustomer("0004", 5000));
        customers.add(new DiscountCustomer("0005", 900));


        /*
        NormalCustomer c1 = new NormalCustomer("0001", 1200);
        NormalCustomer c2 = new NormalCustomer("0002", 800);
        SilverCustomer c3 = new SilverCustomer("0003", 2000);
        GoldenCustomer c4 = new GoldenCustomer("0004", 5000);
        DiscountCustomer c5 = new DiscountCustomer("0006", 900);
         */
        for (int i = 0; i < 5; i++) {
            customers.get(i).print();
        }
        for (NormalCustomer c: customers){
            c.print();
        }

        /*
        c1.print();
        c2.print();
        c3.print();
        c4.print();
        c5.print();
        */
    }
}

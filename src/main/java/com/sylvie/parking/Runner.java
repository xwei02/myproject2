package com.sylvie.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "ABC-1234";
        String enterTime = "08:00";
        String exitTime = "11:59";
        SimpleDateFormat sdf =
                new SimpleDateFormat("HH:mm");
        //Exception例外 vs. Error錯誤
        Date d1 = null;
        Date d2 = null;
        try {
            d1 = sdf.parse(enterTime);
        } catch (Exception a) {
            System.out.println("Wrong Format");
        }
        System.out.println(d1);
        System.out.println(d1.getTime());
        //long ms = 3*60*60*1000;

        try {
            d2 = sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            int mins =(int) ((d2.getTime()-d1.getTime())/1000/60);
            System.out.println(mins);
            int fee =30*(mins/60);
            System.out.println("Fee:"+fee);
            /*if(mins >=194){
                fee = 90;
            }else {
                fee = 120;
            }*/
            //3:14 => NTD$90 , 3:15 => NTD$120
            //3:15-3:30 => NTD$105
        } catch (Exception e){
            System.out.println("Wrong Format");
        }


    }
}

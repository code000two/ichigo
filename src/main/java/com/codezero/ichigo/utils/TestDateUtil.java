package com.codezero.ichigo.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDateUtil {
    public static void main(String[] args) {
        getYestdayDate();
        getTodayDate();
        getTomorrowDate();
    }
    public static void getTodayDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String date= sdf.format(new Date());
        System.out.println(date);
    }
    public static void getYestdayDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        calendar.add(calendar.DATE,-1);
        //Date date = new Date(new Date().getTime()-24*60*60*1000);
        String date= sdf.format(calendar.getTime());
        System.out.println(date);
    }
    public static void getTomorrowDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        calendar.add(calendar.DATE,1);
        //Date date = new Date(new Date().getTime()+24*60*60*1000);
        String date= sdf.format(calendar.getTime());
        System.out.println(date);
    }
}

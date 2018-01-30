package chapter1.lecture2;

import java.util.Date;

public class DateAndTime {
    public static void main(String[] args){
        Date date=new Date();
        String time=String.format("%tc",date);
        String form=String.format("%tF",date);
        //将格式化后的日期时间输出
        System.out.println("全部的时间信息是："+time);
        System.out.println("年-月-日格式："+form);
    }
}

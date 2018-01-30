package chapter1.lecture2;

import java.util.Date;

public class Dates {
    public static void main(String args[]){
        Date date=new Date();
        String s=String.format("%te",date);
        System.out.println(s);


    }
}

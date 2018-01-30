package chapter1.lecture2;

public class Blak {
    public static void main(String args[]){
        String str="  Java   class  ";
        System.out.println("字符串原来的长度："+str.length());//将str原来的长度输出
        System.out.println("去掉空格后的长度："+str.trim().length());//将str去掉前导和尾部的空格后的结果输出
    }
}

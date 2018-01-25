package chapter1.lecture1;

public class Number {                       //创建类
    public static void main(String[] args){ //主方法
        byte mybyte=124;                    //声明byte型变量并赋值
        short myshort=32564;
        int myint=45784612;
        long mylong=46789451;
        long result=mybyte+myint+myshort+mylong;//获得各数相加后的结果
        System.out.println("结果为："+result);   //将以上变量相加的结果输出

    }
}

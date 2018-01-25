package chapter1.lecture1;

public class Calculation {
    public static void main(String[] args){
        int a=2;
        int b=5;
                                    //声明boolean型变量，用于保存应用逻辑运算符“&&”的返回值
        boolean result =((a>b)&&(a!=b));
                                    //声明boolean型变量，用于保存应用逻辑运算符“||”的返回值
        boolean result2=((a>b)||(a!=b));
        System.out.println(result);
        System.out.println(result2);
    }
}

package chapter1.lecture1;

public class Conver {
    public static void main(String[] args){
                                    //定义byte型变量mybyte，并把byete型变量允许的最大值赋给mybyte
        byte mybyte=127;
        int myint=150;
        float myfloat=452.12f;
        char mychar=10;
        double mydouble=45.46546;
        System.out.println("byte型与float型数据进行运算结果为:"+(mybyte+myfloat));
        /* 将运算结果输出 */
        System.out.println("byte型与int型数据进行运算结果为:"+(mybyte*myint));
        System.out.println("byte型与char型数据进行运算结果为:"+(mybyte/mychar));
        System.out.println("double型与char型数据进行运算结果为:"+(mydouble+mychar));

    }
}

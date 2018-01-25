package chapter1.lecture1;

public class Practise2 {                    //新建类
    static int age=7;                       //定义成员变量age
    public static void main(String[] args){ //主方法
        int name=13;                        //定义局部变量name
        /* 依次将变量age和变量name的比较结果输出 */
        System.out.println("age>name的返回值为:"+(age>name));
        System.out.println("age==name的返回值为:"+(age==name));
        System.out.println("age!=name的返回值为:"+(age!=name));
        System.out.println("age>=name的返回值为:"+(age>=name));
        System.out.println("age<=name的返回值为:"+(age<=name));
    }
}

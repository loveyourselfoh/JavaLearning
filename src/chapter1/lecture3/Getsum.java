package chapter1.lecture3;

public class Getsum {
    public static void main(String[] args){
        int x=1;
        int sum=0;
        while(x<=10){
            sum=sum+x;
            x++;
        }
        System.out.println("sum="+sum);
    }
}

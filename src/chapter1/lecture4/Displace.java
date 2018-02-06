package chapter1.lecture4;

import java.util.Arrays;

public class Displace {
    public static void main(String[] args){
        int array[]=new int[]{45,12,2,10};
        Arrays.fill(array,1,2,8);
        for(int i=0;i<array.length;i++){
            System.out.println("第"+i+"元素是："+array[i]);
        }
    }
}

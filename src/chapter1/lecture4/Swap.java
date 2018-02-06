package chapter1.lecture4;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args){
        int array[]=new int[5];
        Arrays.fill(array,8);                 //使用同一个值对数组进行填充
        for(int i=0;i<array.length;i++){      //循环遍历数组中的元素
            //将数组中的元素依次输出
            System.out.println("第"+i+"个元素是："+array[i]);
        }

    }
}

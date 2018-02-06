package chapter1.lecture4;

import java.util.Arrays;

public class Mine {
    public static void main(String[] args){
        int arr[]=new int[]{4,25,10};
        Arrays.sort(arr);
        int index=Arrays.binarySearch(arr,0,1,8);
        System.out.println(index);
    }
}

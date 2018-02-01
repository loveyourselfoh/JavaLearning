package chapter1.lecture3;

public class Practise2 {
    public static void main(String[] args){
        int lay=7;                           //菱形的层数
        for(int i=1;i<=lay;i++){
            for(int j=Math.abs((lay+1)/2-i);j>0;j--){
                System.out.println(" ");
            }
            if(i<=(lay+1)/2) {               //上半层面
                for (int m = 1; m <= 2 * i - 1; m++) {
                    System.out.println("*");
                }
            }
            else{
                for(int n=(lay-i)*2+1;n>0;n--){
                    System.out.println("*");
                }
                System.out.println();

            }
        }


    }
}

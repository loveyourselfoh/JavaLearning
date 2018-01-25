package chapter1.lecture1;

public class BreakOutsideNested {
    public static void main(String[] args){
        Loop: for(int i=0; i<3; i++){
            for(int j=0; j<6; j++){
                if(j==4){
                    break Loop;//跳出的是外层for循环，即标签Loop所对应的循环体
                }
            }

        }
    }
}

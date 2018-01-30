package chapter1.lecture2;

public class Jerque {
    public static void main(String[] args){
        String str="";
        //定义对字符串执行操作的起始时间
        long starTime=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            str=str+i;
        }
        long endTime=System.currentTimeMillis();
        long time=endTime-starTime;
        System.out.println("String消耗时间："+time);
        StringBuilder builder=new StringBuilder("");
        starTime=System.currentTimeMillis();
        for(int j=0;j<10000;j++){
            builder.append(j);
        }
        endTime=System.currentTimeMillis();
        time=endTime-starTime;
        System.out.println("StringBuilder消耗时间："+time);

    }
}

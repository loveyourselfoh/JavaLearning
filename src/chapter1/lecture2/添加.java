package chapter1.lecture2;

public class 添加 {
    public static void main(String[] args){
        StringBuilder bf=new StringBuilder("hello");
        bf.insert(5,"word");
        System.out.println(bf.toString());
    }
}

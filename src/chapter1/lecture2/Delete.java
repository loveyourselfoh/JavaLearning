package chapter1.lecture2;

public class Delete {
    public static void main(String[] args){
        StringBuilder bf=new StringBuilder("StringBuilder");
        bf.delete(5,10);
        System.out.println(bf.toString());
    }
}

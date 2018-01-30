package chapter1.lecture2;

public class NewStr {
    public static void main(String args[]){
        String str="adress";
        //字符串str中的字符"a"替换成"A"后返回的新字符串newstr
        String newstr=str.replace("a","A");
        System.out.println(newstr);
    }
}

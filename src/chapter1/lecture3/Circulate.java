package chapter1.lecture3;

public class Circulate {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum = sum + i;
        }

        System.out.println("2到100之间的所有偶数和：" + sum);
    }
}

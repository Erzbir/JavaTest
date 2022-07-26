package practise;

import java.util.Scanner;

public class Test_24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入整数:");
        int num = scan.nextInt();
        System.out.print("输入项数:");
        int n = scan.nextInt();
        long result = sum(n, num);
        System.out.println(result);
        scan.close();
    }

    private static long sum(int a, int b) {
        if (b > 1) {
            return a + sum(a, b - 1) * 10;
        } else return a;
    }
}

package practise;

import java.util.Scanner;

public class Test_4 {
    public static void main(String[] args) {
        System.out.print("输入一个数:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (isPrimeNumber(num)) {
            System.out.println("质数");
        } else {
            System.out.println("不是质数");
        }
        scan.close();
    }

    public static boolean isPrimeNumber(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2 - num % 2; i++) {
            if (num % i != 0) {
                return false;
            }
        }
        return true;
    }
}

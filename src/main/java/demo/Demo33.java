package demo;

import java.util.Scanner;

public class Demo33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter tow numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();
        System.out.println(greatestCommonDivisor(num1, num2));
        scan.close();
    }

    public static int greatestCommonDivisor(int num1, int num2) {
        int key = Math.min(num1, num2);
        int ans = 0;
        for (int i = 2; i <= key; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ans = i;
            }
        }
        return ans;
    }
}

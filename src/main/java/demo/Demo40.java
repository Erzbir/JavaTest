package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/7/1 16:59
 */
public class Demo40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = input.nextInt();
        while (num != 1) {
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                    num /= i;
                    break;
                }
            }
        }
    }
}
package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/7/1 12:15
 */
public class Demo23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a threes-digit integer:");
        int num = input.nextInt();
        int n1 = num % 10;
        int n2 = num / 100;
        if (n1 == n2) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}
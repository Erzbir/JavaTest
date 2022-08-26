package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/6/24 16:55
 */
public class Demo11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000:");
        int num = input.nextInt();
        int n1 = num % 10;
        num /= 10;
        int n2 = num % 10;
        num /= 10;
        int n3 = num % 10;
        System.out.println("The sum of the digits is " + (n1 + n2 + n3));
    }
}
package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/7/4 11:10
 */
public class Demo58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value(0 to 15):");
        int num = input.nextInt();
        if (num > 15 || num < 0) {
            System.out.println(num + " is an invalid input");
        } else {
            if (num <= 9) {
                System.out.println("The hex value is " + (char)(num - 0 + '0'));
            } else {
                System.out.println("The hex value is " + (char) (num - 10 + 'A'));
            }
        }
    }
}
package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/7/1 15:49
 */
public class Demo31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int num = input.nextInt();
        System.out.printf("Is %d divisible by 5 and 6? %b\n", num, (num % 5 == 0 && num % 6 == 0));
        System.out.printf("Is %d divisible by 5 or 6? %b\n", num, (num % 5 == 0 || num % 6 == 0));
        System.out.printf("Is %d divisible by 5 or 6, but not both? %b\n", num, (num % 5 == 0 ^ num % 6 == 0));

    }
}
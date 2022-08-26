package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/7/4 8:35
 */
public class Demo51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers:");
        int max = 0;
        int count = 0;
        while (true) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            if (num > max) {
                max = num;
                count = 1;
            } else if (num == max) {
                count++;
            }
        }
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}
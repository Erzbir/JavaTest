package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/7/4 13:42
 */
public class Demo80 {
    public static void main(String[] args) {
        int[] temp = new int[101];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100:");
        while (true) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            temp[num]++;
        }
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] > 0) {
                if (temp[i] > 1) {
                    System.out.println(i + " occurs " + temp[i] + " times");
                } else {
                    System.out.println(i + " occurs " + temp[i] + " time");
                }
            }
        }
    }
}
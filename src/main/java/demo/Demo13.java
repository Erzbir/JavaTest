package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/6/24 16:58
 */
public class Demo13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms:");
        double M = input.nextDouble();
        System.out.print("Enter the initial temperature:");
        double init = input.nextDouble();
        System.out.print("Enter the final temperature:");
        double fin = input.nextDouble();
        double Q = M * (fin - init) * 4184;
        System.out.printf("The energy needed is %.2f", Q);
    }
}
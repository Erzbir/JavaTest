package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/6/24 17:07
 */
public class Demo15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1 and y1:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter x2 and y2:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);

        System.out.printf("The distance between the two points is %.2f", distance);
    }
}
package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/7/1 15:18
 */
public class Demo27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates:");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if (x <= 5 && x >= -5 && y <= 2.5 && y >= -2.5) {
            System.out.printf("Point (%.1f, %.1f) is in the rectangle", x, y);
        } else {
            System.out.printf("Point (%.1f, %.1f) is not in the rectangle", x, y);
        }
    }
}
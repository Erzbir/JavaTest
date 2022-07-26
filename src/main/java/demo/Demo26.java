package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/7/1 12:31
 */
public class Demo26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates:");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double distance = Math.pow(Math.pow(x - 0, 2) + Math.pow(y - 0, 2), 0.5);
        if (distance <= 10) {
            System.out.printf("Point (%.1f, %.1f) is in the circle", x, y);
        } else {
            System.out.printf("Point (%.1f, %.1f) is not in the circle", x, y);
        }
    }
}
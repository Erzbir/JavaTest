package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/7/1 15:22
 */
public class Demo28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point's x- and y- coordinates:");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if (x >= 0 && x <= 200 && (y / (200 - x)) < 0.5) {
            System.out.println("The point is in the triangle");
        } else {
            System.out.println("The point is not in the triangle");
        }
    }
}
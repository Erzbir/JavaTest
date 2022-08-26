package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/6/24 17:31
 */
public class Demo20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double delt = b * b - 4 * a * c;

        if (delt > 0) {
            double x1 = (-b + Math.pow(delt, 0.5)) / (2 * a);
            double x2 = (-b - Math.pow(delt, 0.5)) / (2 * a);
            System.out.printf("The equation has two roots %.2f and %.2f", x1, x2);
        } else if (delt == 0) {
            double x = -b / (2 * a);
            System.out.printf("The equation has one root %.2f", x);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
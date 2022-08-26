package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/7/1 12:02
 */
public class Demo21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b,c,d,e,f:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double delt = a * d - b * c;
        if (delt == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e * d - b * f) / delt;
            double y = (a * f - e * c) / delt;
            System.out.printf("x is %.1f and y is %.1f", x, y);
        }
    }
}
package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/7/4 11:06
 */
public class Demo56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides:");
        int n = input.nextInt();
        System.out.print("Enter the side:");
        double s = input.nextDouble();
        double area = n * s * s / (4 * Math.tan(Math.PI / n));
        System.out.printf("The area of the polygon is %.2f", area);
    }
}
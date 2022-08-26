package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/6/24 16:51
 */
public class Demo10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder:");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = Math.pow(radius, 2) * Math.PI;
        double volume = area * length;
        System.out.printf("The area is %.2f \n", area);
        System.out.printf("The volume is %.2f \n", volume);
    }
}
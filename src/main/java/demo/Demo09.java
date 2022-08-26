package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/6/24 16:49
 */
public class Demo09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius:");
        double cel = input.nextDouble();
        double fah = (9.0 / 5) * cel + 32;
        System.out.printf("%.2f Celsius is %.2f Fahrenheit", cel, fah);
    }
}
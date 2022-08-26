package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/6/24 17:12
 */
public class Demo17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight in kilogram:");
        double weight = input.nextDouble();
        System.out.print("Enter the height in meter:");
        double height = input.nextDouble();
        double BMI = weight / Math.pow(height, 2);

        if (BMI >= 30.0) {
            System.out.println("过胖");
        } else if (BMI >= 25.0) {
            System.out.println("超重");
        } else if (BMI >= 18.5) {
            System.out.println("正常");
        } else {
            System.out.println("偏瘦");
        }
    }
}
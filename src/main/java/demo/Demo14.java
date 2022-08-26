package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/6/24 17:03
 */
public class Demo14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount:");
        double money = input.nextDouble();
        double rate = 0.05 / 12;

        double amount = money * (1 + rate);
        amount = (money + amount) * (1 + rate);
        amount = (money + amount) * (1 + rate);
        amount = (money + amount) * (1 + rate);
        amount = (money + amount) * (1 + rate);
        amount = (money + amount) * (1 + rate);
        System.out.printf("After the sixth month, the account value is $%.2f", amount);
    }
}
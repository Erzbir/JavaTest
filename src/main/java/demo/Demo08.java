package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/6/24 16:44
 */
public class Demo08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter money:");   //11.56
        int penny = (int) (input.nextDouble() * 100);   //1156

        int dollar = penny / 100;
        penny = penny % 100;

        int quarter = penny / 25;
        penny = penny % 25;

        int dime = penny / 10;
        penny = penny % 10;

        int nickel = penny / 5;
        penny = penny % 5;

        System.out.println("dollar = " + dollar);
        System.out.println("quarter = " + quarter);
        System.out.println("dime = " + dime);
        System.out.println("nickel = " + nickel);
        System.out.println("penny = " + penny);
    }
}
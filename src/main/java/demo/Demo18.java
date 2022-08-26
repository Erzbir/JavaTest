package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/6/24 17:18
 */
public class Demo18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入年份：");
        int year = input.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("闰年");
        } else {
            System.out.println("平年");
        }
    }
}
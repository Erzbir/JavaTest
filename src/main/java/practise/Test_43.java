package practise;

import java.util.Scanner;

public class Test_43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("输入年份:");
        int year = in.nextInt();
        if (isLeapYear(year)) {
            System.out.println("闰年");
        } else {
            System.out.println("不是闰年");
        }
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}


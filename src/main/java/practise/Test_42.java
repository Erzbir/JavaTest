package practise;

import java.util.Scanner;

public class Test_42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int month = scan.nextInt();
        int day = scan.nextInt();
        String[] week = {"周六", "周天", "周二", "周三", "周四", "周五", "周六"};
        System.out.println(week[week(year, month, day)]);
        scan.close();
    }

    private static int week(int year, int month, int day) {
        year = month <= 2 ? year - 1 : year;
        int j = year / 100, k = year % 100;
        int m = month == 1 ? 13 : month == 2 ? 14 : month;
        return (day + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
    }
}

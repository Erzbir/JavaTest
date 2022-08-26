package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/6/24 16:56
 */
public class Demo12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT:");
        int gmt = input.nextInt();
        long totalSeconds = System.currentTimeMillis() / 1000;
        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHours = (totalHours + gmt) % 24;

        System.out.println(currentHours + ":" + currentMinutes + ":" + currentSeconds);
    }
}
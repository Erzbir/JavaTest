package demo;

import java.util.Scanner;

public class Demo44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(calculateSum(scan.nextInt()));
        scan.close();
    }

    public static double calculateSum(int num) {
        double sum = 0;
        for (int i = 1; i < 98; i++) {
            sum = (double) i / (i + 2);
        }
        return sum;
    }
}

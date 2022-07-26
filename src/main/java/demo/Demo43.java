package demo;

import java.util.Scanner;

public class Demo43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of lines:");
        int n = scan.nextInt();
        printPatten(n);
        scan.close();
    }

    public static void printPatten(int n) {
        for (int i = 1; i < n; i++) {
            int b = i - 1;
            int a = 0;
            printSpace(n, i);
            for (int j = i; j < 2 * i - 1; j++) {
                System.out.print((int) Math.pow(2, a++) + "\t");
            }
            System.out.print((int) Math.pow(2, i - 1) + "\t");
            for (int m = i; m < 2 * i - 1; m++) {
                System.out.print((int) Math.pow(2, b-- - 1) + "\t");
            }
            System.out.println();
        }
    }

    public static void printSpace(int n, int i) {
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print("\t");
        }
    }
}

package demo;

import java.util.Scanner;

public class Demo41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of lines:");
        int n = scan.nextInt();
        printPatten(n);
        scan.close();
    }

    public static void printPatten(int n) {
        printNum(n);
    }

    public static void printNum(int n) {
        for (int i = 1; i <= n; i++) {
            int a = 2;
            int b = i;
            printSpace(n, i);
            for (int m = i; m < 2 * i - 1; m++) {
                System.out.print(b-- + "\t");
            }
            System.out.print("1\t");
            for (int j = i; j < 2 * i - 1; j++) {
                System.out.print(a++ + "\t");
            }
            System.out.println();
        }
    }

    public static void printSpace(int n, int i) {
        for (int j = 0; j < n - i; j++) {
            System.out.print("\t");
        }
    }
}

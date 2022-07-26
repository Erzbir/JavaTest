package demo;

import java.util.Scanner;

public class Demo42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of line:");
        int n = scan.nextInt();
        printPatten_1(n);
        System.out.println();
        printPatten_2(n);
        System.out.println();
        printPatten_3(n);
        System.out.println();
        printPatten_4(n);
        scan.close();
    }

    public static void printPatten_1(int n) {
        for (int i = 1; i < n; i++) {
            int a = 1;
            for (int j = 0; j < i; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }

    public static void printPatten_2(int n) {
        for (int i = 1; i < n; i++) {
            int a = 1;
            for (int j = 0; j < n - i; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }

    public static void printPatten_3(int n) {
        for (int i = 1; i < n; i++) {
           int a = i;
            printSpace(n, i);
            for (int j = 0; j < i; j++) {
               System.out.print(a-- + "\t");
           }
           System.out.println();
        }
    }

    public static void printPatten_4(int n) {
        for (int i = 1; i < n; i++) {
            int a = 1;
            printSpace(n, n - i);
            for (int j = 0; j < n - i; j++) {
                System.out.print(a++ + "\t");
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

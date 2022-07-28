package demo;

import java.util.Scanner;

class Demo58 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a decimal digital:");
        displayHexadecimal(scan.nextInt());
        scan.close();
    }

    public static void displayHexadecimal(int n) {
        if (n < 0 || n > 15) {
            System.out.print(n + " is a invalid input");
            return;
        }
        if (n < 10) {
            System.out.println(n);
        } else {
            char s = (char) ('A' + (n - 10));
            System.out.println(s);
        }
    }
}
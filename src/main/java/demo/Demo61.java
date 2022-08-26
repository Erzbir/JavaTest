package demo;

import java.util.Scanner;

class Demo61 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 12 digits:");
        String s = scan.next();
        System.out.println("ISBN-13 is: " + creatISBN(s));
    }

    public static String creatISBN(String s) {
        int sum = 0, a = 1, b = 3;
        for (int i = 0; i < s.length(); i++) {
            int n = Integer.parseInt(String.valueOf(s.charAt(i)));
            sum += a * n;
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
        }
        sum = 10 - sum % 10;
        if (sum == 10) {
            return s + 0;
        } else {
            return s + sum;
        }
    }
}
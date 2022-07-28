package demo;

import java.util.Scanner;

class Demo60 {
    public static void main(String[] args) {
        System.out.print("Enter a String:");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        reversString(s);
    }

    public static void reversString(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
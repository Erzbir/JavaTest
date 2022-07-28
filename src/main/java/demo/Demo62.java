package demo;

import java.util.Scanner;

class Demo62 {
    public static void main(String[] args) {
        System.out.print("Entre a String:");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        display(s);
    }

    public static void display(String s) {
        for (int i = 0; i < s.length(); i += 2) {
            System.out.print(s.charAt(i));
        }
    }
}
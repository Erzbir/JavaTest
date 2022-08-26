package demo;

import java.util.Scanner;

class Demo63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String:");
        String s = scan.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c <= 90 && c >= 65) {
                count++;
            }
        }
        System.out.println(count);
        scan.close();
    }
}
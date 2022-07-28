package demo;

import java.util.Scanner;

class Demo63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String:");
        String s = scan.nextLine();
        System.out.println(countTheUppercase(s));
        scan.close();
    }

    public static int countTheUppercase(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 90 && s.charAt(i) >= 65) {
                count++;
            }
        }
        return count;
    }
}
package demo;

import java.util.Scanner;

class Demo64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String s1 = scan.nextLine();
        System.out.print("Enter the second string:");
        String s2 = scan.nextLine();
        System.out.println(theSamePrefix(s1, s2));
        scan.close();
    }

    public static String theSamePrefix(String s1, String s2) {
        if (s1.charAt(0) != s2.charAt(0)) {
            return null;
        }
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i) && i > 1) {
                return s1.substring(0, i);
            }
        }
        return s1.length() > s2.length() ? s2 : s1;
    }
}
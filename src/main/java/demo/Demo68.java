package demo;

import java.util.Scanner;

class Demo68 {
    public static void main(String[] args) {
        System.out.print("Enter password: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        if (checkPassword(s)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
        scan.close();
    }

    public static boolean checkPassword(String s) {
        if (s.length() < 8) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp < 48 || temp > 57 && temp < 65 || temp > 90 && temp < 97 || temp > 122) {
                return false;
            }
            if (temp < 58) {
                count++;
            }
        }
        return count >= 2;
    }
}
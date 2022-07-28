package demo;

import java.util.Scanner;

class Demo70 {
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(countLetters(s));
    }

    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp >= 65 && temp < 91 || temp >= 97 && temp < 123) {
                count++;
            }
        }
        return count;
    }
}
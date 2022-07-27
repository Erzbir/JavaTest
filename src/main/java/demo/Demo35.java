package demo;

import java.util.Scanner;

public class Demo35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a palindrome string");
        String str = scan.nextLine();
        if (isPalindrome(str)) {
            System.out.println("This is a palindrome string");
        } else {
            System.out.println("This is not a palindrome string");
        }
        scan.close();
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return false;
        }
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }


}

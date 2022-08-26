package demo;

import java.util.Scanner;

class Demo66 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = scan.nextInt();
        if (isPalindrome(n)) {
            System.out.println(n + " is palindrome");
        } else {
            System.out.println(n + " is not palindrome");
        }
        scan.close();
    }

    public static int reverse(int number) {
        int reverseNum = 0;
        int length = String.valueOf(number).length() - 1;
        while (number != 0) {
            reverseNum += number % 10 * Math.pow(10, length--);
            number /= 10;
        }
        System.out.println(reverseNum);
        return reverseNum;
    }

    public static boolean isPalindrome(int number) {
        int num = reverse(number);
        return num == number;
    }


}
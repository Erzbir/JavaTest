package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/7/1 16:03
 */
public class Demo35 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text:");
        String text = input.nextLine();
        int L = 0;
        int R = text.length() - 1;
        while (L <= R) {
            if (text.charAt(L) == text.charAt(R)) {
                L++;
                R--;
            } else {
                System.out.println("'" + text + "'" + " is not palindrome");
                return;
            }
        }
        System.out.println("'" + text + "'" + " is palindrome");
    }
}


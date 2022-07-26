package demo;

import java.util.Scanner;

public class Demo35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入一个字符串:");
        String str = scan.nextLine();
        if (isPalindrome(str)) {
            System.out.println("是回文字符串");
        } else {
            System.out.println("不是回文字符串");
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

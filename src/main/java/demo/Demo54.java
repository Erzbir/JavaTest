package demo;

import java.util.Scanner;

class Demo54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a hexadecimal:");
        String hex = scan.nextLine();
        System.out.println(hexadecimalToDecimal(hex));
    }

    public static int hexadecimalToDecimal(String hex) {
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++) {
            int temp = digits.indexOf(hex.charAt(i));
            val = 16 * val + temp;
        }
        return val;
    }
}
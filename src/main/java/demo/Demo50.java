package demo;

import java.util.Scanner;

class Demo50 {
    public static void main(String[] args) {
        System.out.print("Enter a decimal number:");
        Scanner scan = new Scanner(System.in);
        System.out.println(decimalToOctal(scan.nextInt()));
    }

    public static int decimalToOctal(int n) {
        int octal = 0;
        int count = 0;
        while (n != 0) {
            octal += n % 8 * Math.pow(10, count);
            count++;
            n >>= 3;
        }
        return octal;
    }
}
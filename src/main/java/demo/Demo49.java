package demo;

import java.util.Scanner;

class Demo49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(("Enter a decimal number:"));
        System.out.println(decimalToBinary(scan.nextInt()));
        scan.close();
    }

    public static int decimalToBinary(int n) {
        int binary = 0;
        int count = 0;
        while (n != 0) {
            binary += n % 2 * (int) Math.pow(10, count);
            count++;
            n >>= 1;
        }
        return binary;
    }
}
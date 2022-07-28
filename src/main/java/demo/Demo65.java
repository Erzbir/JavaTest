package demo;

import java.util.Scanner;

class Demo65 {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        System.out.println(sumDigits(n));
        scan.close();
    }

    public static int sumDigits(long n) {
        if (n <= 10) {
            return (int) n;
        }
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
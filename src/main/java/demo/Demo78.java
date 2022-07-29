package demo;

import java.util.Scanner;

class Demo78 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the floor:");
        System.out.println(fibonacci(scan.nextInt()));
        scan.close();
    }

    public static int fibonacci(int n) {
        if (n < 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
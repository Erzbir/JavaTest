package demo;

import java.util.Scanner;

class Demo56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of sides:");
        int n = scan.nextInt();
        System.out.print("Enter the length of a side:");
        double length = scan.nextDouble();
        System.out.println(calculate(n, length));
        scan.close();
    }

    public static double calculate(int n, double length) {
        return (n * length * length) / (4 * Math.tan(Math.PI / n));
    }
}
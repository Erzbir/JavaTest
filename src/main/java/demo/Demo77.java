package demo;

import java.util.Scanner;

class Demo77 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of the sides:");
        int n = scan.nextInt();
        System.out.print("Enter the side:");
        double side = scan.nextDouble();
        System.out.println(area(n, side));
        scan.close();
    }

    public static double area(int n, double side) {
        return n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 5));
    }
}
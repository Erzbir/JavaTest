package demo;

import java.util.Scanner;

class Demo76 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the side:");
        System.out.println(area(scan.nextDouble()));
        scan.close();
    }

    public static double area(double side) {
        return 5 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 5));
    }
}
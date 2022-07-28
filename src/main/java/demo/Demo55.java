package demo;

import java.util.Scanner;

class Demo55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double r = scan.nextDouble();
        System.out.println(calculate(r));
    }

    public static double calculate(double r) {
        double s = 2 * r * Math.sin(Math.PI / 5);
        return (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
    }
}
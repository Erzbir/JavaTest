package demo;

import java.util.Scanner;

public class Demo45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter precision:");
        double precision = scan.nextDouble();
        System.out.println(calculatePI(precision));
    }

    public static double calculatePI(double precision) {
        double n = 0;
        double k = 1.0;
        for (int i = 1; i < precision; i += 2) {
            n += k / i;
            k = -k;
        }
        return 4.0 * n;
    }
}

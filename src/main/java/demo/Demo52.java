package demo;

import java.util.Arrays;
import java.util.Scanner;

class Demo52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three side:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        System.out.println(Arrays.toString(calculate(a, b, c)));
    }

    public static double[] calculate(double a, double b, double c) {
        double a1 = a * a;
        double a2 = b * b;
        double a3 = c * c;
        return new double[]{
                Math.acos((a1 - a2 - a3) / (-2 * b * c)),
                Math.acos((a2 - a1 - a3) / (-2 * b * c)),
                Math.acos((a3 - a2 - a1) / (-2 * a * b))
        };
    }

}
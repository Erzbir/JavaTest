package demo;

import java.util.Scanner;

class Demo1 {
    public static void main(String[] argv) {
        double a;
        double b;
        double c;
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the first side: ");
        a = scan.nextDouble();
        System.out.print("enter the second side: ");
        b = scan.nextDouble();
        System.out.print("enter the lase side: ");
        c = scan.nextDouble();
        double p = (a + b + c) / 2;
        double S;
        S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("三角形面积: %f", S);
        scan.close();
    }

}

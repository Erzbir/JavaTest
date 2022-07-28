package demo;

import java.util.Scanner;

class Demo69 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        double side1 = scan.nextDouble();
        System.out.print("Enter the second side: ");
        double side2 = scan.nextDouble();
        System.out.print("Enter the last side: ");
        double side3 = scan.nextDouble();
        System.out.println(MyTriangle.area(side1, side2, side3));
    }

}

class MyTriangle {

    public static boolean isValid(double side1, double side2, double side3) {
        return side1 + side2 > side3 && Math.abs(side1 - side2) < side3;
    }

    public static double area(double side1, double side2, double side3) {
        if (!isValid(side1, side2, side3)) {
            System.out.println("Invalid input");
            return -1;
        }
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
package demo;

import java.util.Scanner;

class Demo82 {
    public static void main(String[] args) {
        System.out.print("Enter ten Integer of Double:");
        Scanner scan = new Scanner(System.in);
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextDouble();
        }
        System.out.println(average(arr));
        scan.close();
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double i : array) {
            sum += i;
        }
        return sum / array.length;
    }
}
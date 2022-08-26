package demo;

import java.util.Scanner;

class Demo92 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] m = new double[4][4];
        System.out.println("Enter a 4-by-4matrix row by row:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = scan.nextDouble();
            }
        }
        System.out.println(sumMajorDiagonal(m));
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}
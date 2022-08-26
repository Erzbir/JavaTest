package demo;

import java.util.Arrays;
import java.util.Scanner;

class Demo93 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        System.out.print("Enter matrix1: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = scan.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = scan.nextDouble();
            }
        }
        System.out.println(Arrays.deepToString(addMatrix(a, b)));
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] matrix = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                matrix[i][j] = a[i][j] + b[i][j];
            }
        }
        return matrix;
    }
}
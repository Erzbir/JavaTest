package demo;

import java.util.Scanner;

public class Demo100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] m = new double[3][3];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = scan.nextDouble();
            }
        }
        System.out.println(isMarkovMatrix(m));
        scan.close();
    }

    public static boolean isMarkovMatrix(double[][] m) {
        if (m.length == 0) {
            return false;
        }
        for (int i = 0; i < m[0].length; i++) {
            double sum = 0;
            for (int j = 0; j < m.length; j++) {
                if (m[j][i] <= 0) {
                    return false;
                }
                sum += m[j][i];
            }
            if (sum != 1) {
                return false;
            }
        }
        return true;
    }
}

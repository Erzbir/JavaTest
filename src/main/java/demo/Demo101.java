package demo;

import java.util.Scanner;

public class Demo101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x1 y1 x2 y2 x3 y3: ");
        double[][] m = new double[3][2];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = scan.nextDouble();
            }
        }
        System.out.println(getTriangleArea(m));
        scan.close();
    }

    public static double getTriangleArea(double[][] points) {
        if (((int) (points[0][0] / points[0][1]) ^ (int) (points[1][0] / points[1][1]) ^ (int) (points[2][0] / points[2][1])) == 0) {
            return 0;
        }
        return 0.5 * (points[0][0] * points[1][1] + points[1][0] * points[2][1] + points[2][0] * points[0][1] - points[0][0] * points[2][1] - points[1][0] * points[0][1] - points[2][0] * points[1][1]);
    }
}

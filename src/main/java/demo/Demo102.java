package demo;

import java.util.Arrays;
import java.util.Scanner;

public class Demo102 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x1 y1 x2 y2 x3 y3 x4 y4: ");
        double[][] m = new double[4][2];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = scan.nextDouble();
            }
        }
        System.out.println(Arrays.toString(getFourTriangleArea(m)));
        scan.close();
    }

    public static double[] getFourTriangleArea(double[][] points) {
        if (((int) (points[0][0] / points[0][1]) ^ (int) (points[1][0] / points[1][1]) ^ (int) (points[2][0] / points[2][1]) ^ (int) (points[3][0] / points[3][1])) == 0) {
            return null;
        }
        double area_1 = 0.5 * (points[0][0] * points[1][1] + points[1][0] * points[2][1] + points[2][0] * points[0][1] - points[0][0] * points[2][1] - points[1][0] * points[0][1] - points[2][0] * points[1][1]);
        double area_2 = 0.5 * (points[0][0] * points[3][1] + points[3][0] * points[2][1] + points[2][0] * points[0][1] - points[0][0] * points[2][1] - points[3][0] * points[0][1] - points[2][0] * points[3][1]);
        double area_3 = 0.5 * (points[0][0] * points[1][1] + points[1][0] * points[3][1] + points[3][0] * points[0][1] - points[0][0] * points[3][1] - points[1][0] * points[0][1] - points[3][0] * points[1][1]);
        double area_4 = 0.5 * (points[3][0] * points[1][1] + points[1][0] * points[2][1] + points[2][0] * points[3][1] - points[3][0] * points[2][1] - points[1][0] * points[0][1] - points[2][0] * points[1][1]);
        double[] list = new double[]{area_1, area_2, area_3, area_4};
        Arrays.sort(list);
        return list;
    }
}

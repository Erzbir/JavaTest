package demo;

import java.util.Arrays;

class Demo95 {
    public static void main(String[] args) {
        double[][] points = {
                {-1, 0, 3},
                {-1, -1, -1},
                {4, 1, 1},
                {2, 0.5, 9},
                {3.5, 2, -1},
                {3, 1.5, 3},
                {-1.5, 4, 2},
                {5.5, 4, -0.5},
        };
        System.out.println(Arrays.toString(minDistance(points)));
    }

    public static double[] minDistance(double[][] arr) {
        double[] min = new double[3];
        min[0] = 99999999;
        for (int i = 1; i < arr.length; i++) {
            double temp = 0;
            for (int j = 0; j < arr[i].length; j++) {
                temp += Math.pow(arr[i - 1][j] - arr[i][j], 2);
            }
            if (min[0] > Math.sqrt(temp)) {
                min[0] = Math.sqrt(temp);
                min[1] = i - 1;
                min[2] = i;
            }
        }
        return min;
    }
}
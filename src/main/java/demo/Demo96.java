package demo;

import java.util.Arrays;

class Demo96 {
    public static void main(String[] args) {
        double[][] matrix = new double[4][4];
        randomInput(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void randomInput(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = getRandomInt();
            }
        }
    }

    public static int getRandomInt() {
        return (int) Math.round(Math.random());
    }
}
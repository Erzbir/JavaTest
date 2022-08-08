package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Demo97 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int[][] matrix = new int[3][3];
        revers(matrix, scan.nextInt());
        display(matrix);
        scan.close();
    }

    public static void display(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt == 0) {
                    System.out.print("H  ");
                } else {
                    System.out.print("T  ");
                }
            }
            System.out.println();
        }
    }

    public static void revers(int[][] matrix, int num) {
        int[] arr = getCoin(num);
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = arr[count++];
            }
        }
    }

    public static int[] getCoin(int num) {
        int[] arr = new int[9];
        int i = arr.length - 1;
        while (num != 0) {
            arr[i--] = num % 2;
            num >>= 1;
        }
        return arr;
    }
}
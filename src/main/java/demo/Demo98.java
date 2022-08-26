package demo;

import java.util.Scanner;

class Demo98 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int a = scan.nextInt();
        System.out.print("Enter the length: ");
        int b = scan.nextInt();
        int[][] matrix = new int[a][b];
        System.out.println("Enter the values: ");
        input(matrix);
        System.out.println(isConsecutive(matrix));
        scan.close();
    }

    public static boolean isConsecutive(int[][] values) {
        int count = 0;
        for (int[] value : values) {
            for (int j = 0; j < value.length - 1; j++) {
                if (value[j] == value[j + 1]) {
                    ++count;
                    if (count == 3) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        for (int i = 0; i < values[0].length; i++) {
            for (int j = 0; j < values.length - 1; j++) {
                if (values[j + 1][i] == values[j][i]) {
                    count++;
                    if (count == 3) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        for (int j = 0, i = 0; j < values[i].length - 1 && i < values.length - 1; ) {
            if (values[i][j] == values[++i][j++]) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        for (int j = values.length - 1, i = 0; j > 0; ) {
            if (i < values.length - 1 && values[i][j] == values[++i][--j]) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }

        return false;
    }

    public static void input(int[][] matrix) {
        Scanner scan_2 = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan_2.nextInt();
            }
        }
    }
}
package practise;

import java.util.Arrays;
import java.util.Random;

public class Test_54 {
    public static void main(String[] args) {
        Random rand = new Random(454545);
        int[][] arr = new int[10][11];
        for (int[] ints : arr) {
            Arrays.fill(ints, 12);
        }
        int x = rand.nextInt(11);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!search(arr, i, x)) {
                    x = rand.nextInt(11);
                    j--;
                } else {
                    arr[i][j] = x;
                }
            }
        }
        for (int[] ins : arr) {
            for (int in : ins) {
                System.out.print(in + "  ");
            }
            System.out.println();
        }
    }

    private static boolean search(int[][] arr, int i, int x) {
        for (int j = 0; j < arr[i].length - 1; j++) {
            if (arr[i][j] == x) {
                return false;
            }
        }
        return true;
    }


}


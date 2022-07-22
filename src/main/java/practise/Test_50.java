package practise;

import java.util.Scanner;

public class Test_50 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(isInArray(arr, a) ? "在里面" : "不在里面");

    }

    private static boolean isInArray(int[] arr, int x) {
        if (arr.length == 0) {
            return false;
        }
        for (int j : arr) {
            if (j == x) {
                return true;
            }
        }
        return false;
    }

}
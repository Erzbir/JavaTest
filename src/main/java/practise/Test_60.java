package practise;

import java.util.Scanner;

public class Test_60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1, 1, 9, 3, 9, 3, 7, 7, 4, 2, 4, 5, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10};
        System.out.println("不重复的值为:" + SearchNotDuplicate(arr));
        System.out.println("重复的值为:" + SearchDuplicate(arr2));
        scan.close();
    }

    public static int SearchNotDuplicate(int[] arr) {
        int m = 0, n = 0, i, j;
        for (i = 0, j = arr.length - 1; i <= j; i++, j--) {
            m ^= arr[i];
            n ^= arr[j];
        }
        m ^= n;
        m ^= arr[i - 1];
        return m;
    }

    public static int SearchDuplicate(int[] arr) {
        int m = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            m ^= i ^ arr[i];
        }
        return m;
    }
}
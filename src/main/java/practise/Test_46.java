package practise;

import java.util.Scanner;

public class Test_46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("最低:" + arr[find(arr, "min")]);
        System.out.println("最高:" + arr[find(arr, "max")]);
        sort(arr);
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        scan.close();


    }

    private static void sort(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        if (arr.length == 0 || index1 >= arr.length || index2 >= arr.length) {
            return;
        }
        arr[index1] = arr[index1] ^ arr[index2];
        arr[index2] = arr[index1] ^ arr[index2];
        arr[index1] = arr[index1] ^ arr[index2];
    }

    private static int find(int[] arr, String model) {
        if (arr.length == 0) {
            return -1;
        }
        int m = 1;
        for (int i = 0; i < arr.length; i++) {
            if (model.equalsIgnoreCase("min")) {
                m = arr[i] < arr[m] ? i : m;
            } else if (model.equalsIgnoreCase("max")) {
                m = arr[i] > arr[m] ? i : m;
            }
        }
        return m;
    }
}

package demo;

import java.util.Arrays;
import java.util.Scanner;

class Demo84 {
    public static void main(String[] args) {
        System.out.print("Enter ten integers:");
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(eliminateDuplicates(arr)));
        scan.close();
    }

    public static int[] eliminateDuplicates(int[] list) {
        int i = 0;
        int j = 1;
        int count = 1;
        quickSort(list, 0, list.length - 1);
        while (j < list.length) {
            if (list[i] != list[j]) {
                list[++i] = list[j];
                count++;
            }
            j++;
        }
        int[] arr = new int[count];
        System.arraycopy(list, 0, arr, 0, arr.length);
        return arr;
    }

    public static void quickSort(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int key = arr[left];
        while (i < j) {
            while (i < j && arr[j] >= key) {
                j--;
            }
            while (i < j && arr[i] <= key) {
                i++;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        arr[left] = arr[i];
        arr[i] = key;
        if (i > left) {
            quickSort(arr, left, i - 1);
        }
        if (j < right) {
            quickSort(arr, i + 1, right);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
package demo;

import java.util.Scanner;

class Demo85 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of list and elements:");
        int[] arr = new int[scan.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        if (isSorted(arr)) {
            System.out.println("The list is sorted");
        } else {
            System.out.println("The list is not sorted");
        }
    }

    public static boolean isSorted(int[] list) {
        int k = 0;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[0] < list[list.length - 1]) {
                if (list[i] > list[i + 1]) {
                    return false;
                }
            } else {
                if (list[i] < list[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
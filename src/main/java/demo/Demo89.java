package demo;

import java.util.Scanner;

class Demo89 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length and elements of sorted list1:");
        int[] list1 = new int[scan.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = scan.nextInt();
        }
        System.out.print("Enter the length and elements of sorted list2:");
        int[] list2 = new int[scan.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = scan.nextInt();
        }
        for (int i : merge(list1, list2)) {
            System.out.print(i + "\t");
        }
        scan.close();
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] result = new int[list1.length + list2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        for (; i < list1.length && j < list2.length; k++) {
            if (list1[i] <= list2[j]) {
                result[k] = list1[i];
                i++;

            } else {
                result[k] = list2[j];
                j++;
            }
        }
        if (i < list1.length) {
            for (; i < list1.length; i++, k++) {
                result[k] = list1[i];
            }
        }
        if (j < list2.length) {
            for (; j < list2.length; j++, k++) {
                result[k] = list2[j];
            }
        }
        return result;
    }
}
package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Demo81 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(inputNums()));
    }

    public static Object[] inputNums() {
        Scanner scan = new Scanner(System.in);
        int[] arr1 = new int[10];
        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.print("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            arr1[i] = scan.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            boolean flag = false;
            int k = arr1[i];
            for (int value : arr2) {
                if (value == k) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                continue;
            }
            arr2.add(k);

        }
        scan.close();
        return arr2.toArray();
    }
}
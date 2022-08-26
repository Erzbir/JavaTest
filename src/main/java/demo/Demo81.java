package demo;

import java.util.Scanner;

public class Demo81 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers:");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int size = 10;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size;) {
                if (arr[i] == arr[j]) {
                    for (int k = j + 1; k < size; k++) {
                        arr[k - 1] = arr[k];
                    }
                    size--;
                } else {
                    j++;
                }
            }
        }
        System.out.println("The number of distinct number is " + size);
        System.out.print("The distinct numbers are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
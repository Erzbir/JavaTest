package demo;

import java.util.Scanner;

class Demo88 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of array:");
        int[] arr = new int[scan.nextInt()];
        System.out.print("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        if (isConsecutiveFour(arr)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }
    }

    public static boolean isConsecutiveFour(int[] values) {
        int count = 1;
        int result = 0;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1]) {
                count++;
                result = Math.max(result, count);
            } else {
                count = 1;

            }
        }
        return result > 3;
    }
}
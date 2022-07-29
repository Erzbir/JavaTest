package demo;

import java.util.Scanner;

class Demo83 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter five integer:");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(gcd(arr));
        scan.close();
    }

    public static int gcd(int... numbers) {
        int result = 0;
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        for (int number : numbers) {
            if (number % min != 0) {
                return -1;
            }
        }
        return min;
    }
}
package demo;

import java.util.ArrayList;
import java.util.Scanner;

class Demo51 {
    public static void main(String[] args) {
        System.out.print("Enter a int array:");
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int temp = 1;
        while (temp != 0) {
            temp = scan.nextInt();
            arr.add(temp);
        }
        System.out.println(max(arr));
        scan.close();
    }

    public static int max(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int count = 0;
        for (int j : arr) {
            count++;
            if (max < j) {
                count = 0;
                max = j;
            }
        }
        return max;
    }
}
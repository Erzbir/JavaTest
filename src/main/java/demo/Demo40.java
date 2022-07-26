package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(mini(num));
        scan.close();
    }

    public static ArrayList<Integer> mini(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);
                n /= i;
                i = 1;
            }
        }
        return arr;
    }
}
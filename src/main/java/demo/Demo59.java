package demo;

import java.util.Scanner;

class Demo59 {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        scan.close();
        if (checkValid(num)) {
            System.out.println(num + " is valid");
        } else {
            System.out.println(num + " is invalid");
        }
    }

    public static boolean checkValid(String num) {
        int[] check = {3, 2, 4};
        String[] arr = num.split("-");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() != check[i]) {
                return false;
            }
        }
        return true;
    }
}
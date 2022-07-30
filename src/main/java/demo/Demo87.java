package demo;

import java.util.Scanner;

class Demo87 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of list1 and elements:");
        int[] list1 = new int[scan.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = scan.nextInt();
        }
        System.out.print("Enter the length of list2 and elements:");
        int[] list2 = new int[scan.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list2[i] = scan.nextInt();
        }
        if (equals(list1, list2)) {
            System.out.println("Tow lists are strictly identical");
        } else {
            System.out.println("Tow lists are not strictly identical");
        }
        scan.close();
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length || list1.length == 0) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}
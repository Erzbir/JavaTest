package demo;

import java.util.ArrayList;
import java.util.Scanner;

class Demo80 {
    public static void main(String[] args) {
        countNum();
    }

    public static void countNum() {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100:");
        while (true) {
            int temp = scan.nextInt();
            if (temp == 0) {
                break;
            }
            arr.add(temp);
        }
        for (i = 0; i < arr.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j))) {
                    arr.remove(j);
                    count++;
                }
            }
            String n = "time";
            if (count > 1) {
                n = "times";
            }
            System.out.println(arr.get(i) + "\toccurs\t" + count + n);
            scan.close();
        }
    }
}
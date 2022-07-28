package demo;

import java.util.Scanner;

class Demo53 {
    private static int[][] arr = {
            {1, 3, 5, 7, 9, 11, 13, 15, 17,
                    19, 21, 23, 25, 27, 29, 31},
            {2, 3, 6, 7, 10, 11, 14, 15,
                    18, 19, 22, 23, 26, 27, 30, 31,},
            {4, 5, 6, 7, 12, 13, 14, 15,
                    20, 21, 22, 23, 28, 29, 30, 31},
            {8, 9, 10, 11, 12, 13, 14, 15,
                    24, 25, 26, 27, 28, 29, 30, 31,},
            {16, 17, 18, 19, 20, 21, 22, 23,
                    24, 25, 26, 27, 28, 29, 30, 31}
    };

    public static void main(String[] args) {
        System.out.println(whichDay());
    }

    public static int whichDay() {
        int day = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int count = 0;
            System.out.printf("Set%d\n", i + 1);
            for (int j = 0; j < arr[i].length; j++) {
                count++;
                System.out.print(arr[i][j] + "\t");
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
            System.out.printf("your birthday is in set%d ?\n", i + 1);
            String str = scan.next();
            if (str.equals("yes")) {
                day += Math.pow(2, i);
            }
        }
        scan.close();
        return day;
    }
}
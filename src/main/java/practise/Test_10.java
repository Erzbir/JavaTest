package practise;

import java.util.Scanner;

public class Test_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入层数:");
        int floor = scan.nextInt();
        printPattern(floor);
        scan.close();
    }

    private static void printPattern(int floor) {
        int floor_2 = floor >> 1;
        for (int i = 1; i <= floor_2; i++) {
            PrintPatten.printSpace(floor_2 + 1, i);
            PrintPatten.printAsterisk(i);
            System.out.println();
        }
        if (floor % 2 != 0) {
            for (int i = 0; i <= 2 * floor_2; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = floor_2; i >= 1; i--) {
            PrintPatten.printSpace(floor_2 + 1, i);
            PrintPatten.printAsterisk(i);
            System.out.println();
        }
    }
}

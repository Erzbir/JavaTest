package practise;

import java.util.Scanner;

public class Test_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入层数:");
        int floor = scan.nextInt();
        printPatten(floor);
        scan.close();
    }

    private static void printPatten(int floor) {
        for (int i = 1; i <= floor; i++) {
            PrintPatten.printSpace(floor, i);
            PrintPatten.printAsterisk(i);
            System.out.println();
        }
        for (int i = 1; i <= floor; i++) {
            PrintPatten.printSpace(floor, i);
        }
    }
}

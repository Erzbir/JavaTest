package practise;

import java.util.Scanner;

public class Test_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floor = scan.nextInt();
        for (int i = 1; i <= floor; i++) {
            PrintPatten.printAsterisk(i);
            System.out.println();
        }
        scan.close();
    }
}




package demo;

import java.util.Scanner;

class Demo48 {
    public static void main(String[] args) {
        game();
    }

    public static void game() {
        Scanner scan = new Scanner(System.in);
        System.out.println("0 is stone, 1 is scissors, 2 is cloth");
        int count = 0;
        while (count < 2) {
            int selection = scan.nextInt();
            int selection2 = (int) (Math.random() * 3);
            if (selection == selection2) {
                System.out.println("draw");
            } else if (selection == 2 && selection2 == 1) {
                System.out.println("you lose");
            } else if (selection == 0 && selection2 == 2) {
                System.out.println("you lose");
            } else if (selection == 1 && selection2 == 2) {
                System.out.println("you lose");
            } else {
                System.out.println("you win");
                count++;
            }
        }
        scan.close();
    }
}

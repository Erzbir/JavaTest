package demo;

import java.util.Scanner;

class Demo57 {
    public static void main(String[] args) {
        System.out.print("Enter an ASCII code:");
        Scanner scan = new Scanner(System.in);
        int ascii = scan.nextInt();
        displayCharacter(ascii);
    }

    public static void displayCharacter(int ascii) {
        if (ascii < 0 || ascii > 127) {
            System.out.println(ascii + " is a invalid input");
            return;
        }
        char s = (char) ascii;
        System.out.println(s);
    }
}
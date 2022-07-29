package demo;

import java.util.Scanner;

class Demo79 {
    static long count;

    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner scan = new Scanner(System.in);
        hanoi(scan.nextInt(), 'A', 'B', 'C');
        System.out.println("Move " + count + " times");
        scan.close();
    }

    public static void hanoi(int n, char a, char b, char c) {
        if (n == 1) {
            move(a, c);
        } else {
            hanoi(n - 1, a, c, b);
            move(a, c);
            hanoi(n - 1, b, a, c);
        }
    }

    public static void move(char a, char b) {
        count++;
        System.out.println(a + " -> " + b);
    }

}
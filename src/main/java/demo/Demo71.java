package demo;

import java.util.Scanner;

class Demo71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scanner.nextInt();
        System.out.println(sqrt(num));
    }

    public static double sqrt(long n) {
        double lastGuess = 1;
        double nextGuesss = 0;
        while (true) {
            nextGuesss = (lastGuess + n / lastGuess) / 2;
            if (Math.abs(lastGuess - nextGuesss) <= 0.0001) {
                return nextGuesss;
            } else {
                lastGuess = nextGuesss;
            }
        }
    }
}
// 1.7321428571428572

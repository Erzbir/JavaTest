package demo;

import java.util.Scanner;

class Demo71 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:");
        long n = scan.nextLong();
        System.out.print("Enter epsilon:");
        double m = scan.nextDouble();
        System.out.println(sqrt(n, m));
        scan.close();
    }

    public static double sqrt(long n, double epsilon) {
        double nextGuess = 0;
        double lastGuess = 1.0;
        nextGuess = (lastGuess + n / lastGuess) / 2;
        while (Math.abs(nextGuess - lastGuess) > epsilon) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        return lastGuess;
    }
}

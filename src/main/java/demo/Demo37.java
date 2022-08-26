package demo;

import java.util.Scanner;

public class Demo37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0:");
        int positives = 0;
        int negatives = 0;
        double total = 0;
        while (true) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            } else if (num > 0) {
                positives++;
            } else {
                negatives++;
            }
            total += num;
        }
        int count = positives + negatives;
        if (count == 0) {
            System.out.println("No numbers are entered except 0");
            return;
        }
        double average = total / (count);
        System.out.println("The number of positives is " + positives);
        System.out.println("The number of negatives is " + negatives);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
    }
}
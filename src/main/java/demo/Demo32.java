package demo;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/7/1 15:52
 */
public class Demo32 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int com = random.nextInt(101);
        System.out.println("Guess a magic number between 0 and 100");
        while (true) {
            System.out.print("Enter your guess:");
            int num = input.nextInt();
            if (num < com) {
                System.out.println("Your guess is too low");
            } else if (num > com) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Yes, the number is " + num);
                break;
            }
        }
    }
}
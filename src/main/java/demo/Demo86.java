package demo;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/7/4 14:14
 */
public class Demo86 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop:");
        int balls = scanner.nextInt();
        System.out.print("Enter the number of slots in the bean machine:");
        int soltsNumber = scanner.nextInt();
        int[] slots = new int[soltsNumber];
        for(int i = 0; i < balls; i++) {
            String path = "";
            int RCount = 0;
            for(int j = 0; j < soltsNumber - 1; j++) {
                if(random.nextInt(2) == 0) {
                    path = path + "L";
                }else{
                    path = path + "R";
                    RCount++;
                }
            }
            System.out.println(path);
            slots[RCount]++;
        }
        for(int i = 0; i < slots.length; i++) {
            System.out.print(slots[i] + " ");
        }
    }
}
package demo;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/6/24 17:20
 */
public class Demo19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int comNum = random.nextInt(11) + 10;
        System.out.print("请输入两位数：");
        int usrNum = input.nextInt();

        int u1 = usrNum / 10;
        int u2 = usrNum % 10;
        int c1 = comNum / 10;
        int c2 = comNum % 10;

        if (usrNum == comNum) {
            System.out.println("奖金10000元");
        } else if (u1 == c2 && u2 == c1) {
            System.out.println("奖金为3000元");
        } else if (u1 == c1 || u1 == c2 || u2 == c1 || u2 == c2) {
            System.out.println("奖金1000元");
        } else {
            System.out.println("谢谢惠顾");
        }
    }
}
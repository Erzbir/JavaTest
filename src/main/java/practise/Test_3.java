package practise;

import java.util.Scanner;

public class Test_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalScore = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("输入第" + i + "个数:");
            int score = scan.nextInt();
            totalScore += score;
        }
        System.out.println("平均分: " + totalScore / 5);
        scan.close();
    }
}

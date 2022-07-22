package practise;

import java.util.Scanner;

public class Test_47 {
    public static void main(String[] args) {
        System.out.print("输入x, y:");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        scan.close();
        if (isInCycle(x, y)) {
            System.out.println("在圆内");
        } else {
            System.out.println("不在圆内");
        }
    }

    private static boolean isInCycle(double x, double y) {
        if (x < 0) {
            x = -x;
        }
        if (y < 0) {
            y = -y;
        }
        return Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10;
    }
}
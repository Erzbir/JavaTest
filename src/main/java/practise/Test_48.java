package practise;

import java.util.Scanner;

public class Test_48 {
    public static void main(String[] args) {
        System.out.print("输入x, y:");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        scan.close();
        if (isIn(x, y)) {
            System.out.println("在矩形内");
        } else {
            System.out.println("不在矩形内");
        }
    }

    private static boolean isIn(double x, double y) {
        if (x < 0) {
            x = -x;
        }
        if (y < 0) {
            y = -y;
        }
        return x < 5 && y < 2.5;
    }
}
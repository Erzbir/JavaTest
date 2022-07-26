package practise;

import java.util.Scanner;

public class Test_35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入高:");
        double h = scan.nextDouble();
        System.out.print("输入半径:");
        double r = scan.nextDouble();
        double s = 2 * Math.PI * r * (r + h);
        double v = Math.PI * Math.pow(r, 2) * h;
        System.out.println(s + " " + v);
        scan.close();
    }
}

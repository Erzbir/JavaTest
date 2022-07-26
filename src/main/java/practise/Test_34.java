package practise;

import java.util.Scanner;

public class Test_34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入摄氏温度:");
        double Celsius = scan.nextInt();
        double Fahrenheit = (9.0 / 5) * Celsius + 32;
        System.out.println(Fahrenheit);
        scan.close();
    }
}

package practise;

import java.util.Scanner;

public class Test_36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入一个整数:");
        int num = scan.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
        scan.close();
    }
}

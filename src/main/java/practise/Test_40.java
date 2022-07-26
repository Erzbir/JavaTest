package practise;

import java.util.Scanner;

public class Test_40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入一个整数:");
        int num = scan.nextInt();
        if (isPalindromes(num))
            System.out.println("是回文数");
        else
            System.out.println("不是回文数");
        scan.close();
    }

    private static boolean isPalindromes(int num) {
        String str = String.valueOf(num);
        int head = 0, rear = str.length() - 1;
        while (head <= rear) {
            if (str.codePointAt(head) == str.codePointAt(head)) {
                return true;
            }
            head++;
            rear--;
        }
        return false;
    }
}

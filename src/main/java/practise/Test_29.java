package practise;

import java.util.Scanner;

public class Test_29 {
    public static void main(String[] args) {
        System.out.print("输入字符串:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.toUpperCase();
        System.out.println(str);
        scan.close();
    }
}

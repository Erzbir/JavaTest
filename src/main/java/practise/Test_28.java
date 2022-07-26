package practise;

import java.util.Scanner;

public class Test_28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入字符串:");
        String str = scan.nextLine();
        str = str.trim();
        str = str.replaceAll(" ", "");
        System.out.println(str);
        scan.close();
    }
}

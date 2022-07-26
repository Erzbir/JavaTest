package practise;

import java.util.Scanner;

public class Test_27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入文件路径:");
        String path = scan.nextLine();
        String[] temp = path.split("\\.");
        String result = temp[temp.length - 1];
        System.out.println(result);
        scan.close();
    }
}

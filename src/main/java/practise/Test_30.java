package practise;

import java.util.Scanner;

public class Test_30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入一句英文:");
        String str = scan.nextLine();
        String[] temp = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = temp.length - 1; i >= 0; i--) {
            result.append(temp[i]).append(" ");
        }
        System.out.println(result);
        scan.close();
    }
}

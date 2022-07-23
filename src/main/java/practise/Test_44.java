package practise;

import java.util.Scanner;

public class Test_44 {
    public static void main(String[] args) {
        System.out.print("输入十进制数:");
        Scanner scan = new Scanner(System.in);
        int dec = scan.nextInt();
        scan.close();
        System.out.println("十六进制数:" + decToHex(dec));
    }

    public static String decToHex(int dec) {
        StringBuilder hex = new StringBuilder();
        char temp;
        int hex_value;
        while (dec != 0) {
            hex_value = dec % 16;
            temp = hex_value <= 9 && hex_value >= 0 ? (char) (hex_value + '0') : (char) (hex_value - 10 + 'A');
            hex.insert(0, temp);
            dec /= 16;
        }
        return hex.toString();
    }
}

package demo;

import java.util.Scanner;

public class Demo34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入一个十进制数:");
        int dec = scan.nextInt();
        System.out.println(decToHex(dec));
        scan.close();
    }

    public static String decToHex(int dec) {
        StringBuilder hex = new StringBuilder();
        char temp;
        int hexTemp;
        while (dec != 0) {
            hexTemp = dec % 16;
            temp = hexTemp <= 9 && hexTemp >= 0 ? (char) (hexTemp + '0') : (char) (hexTemp - 10 + 'A');
            hex.insert(0, temp);
            dec >>= 4;
        }
        return hex.toString();

    }
}

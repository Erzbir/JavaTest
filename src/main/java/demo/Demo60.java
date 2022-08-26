package demo;

import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/7/4 11:27
 */
public class Demo60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN:");
        String ssn = input.nextLine();
        if (ssn.length() != 11) {
            System.out.println(ssn + " is an invalid social security number");
        } else if (ssn.charAt(3) != '-' || ssn.charAt(6) != '-') {
            System.out.println(ssn + " is an invalid social security number");
        } else {
            boolean flag = true;
            for (int i = 0; i < ssn.length(); i++) {
                if (i == 3 || i == 6) {
                    continue;
                }
                if (ssn.charAt(i) < '0' || ssn.charAt(i) > '9') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(ssn + " is a valid social security number");
            } else {
                System.out.println(ssn + " is an invalid social security number");
            }
        }
    }
}
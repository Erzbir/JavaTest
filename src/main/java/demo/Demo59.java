package demo;

import java.util.Scanner;

public class Demo59 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string s1:");
        String s1 = scanner.nextLine();
        System.out.print("Enter string s2:");
        String s2 = scanner.nextLine();
        if (contains(s1,s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }
    public static boolean contains(String s1, String s2) {
        for(int k = 0; k <= s1.length() - s2.length(); k++){
            if(s1.charAt(k) == s2.charAt(0)) {
                int i = k + 1;
                int j =1;
                boolean flag = true;
                while(j < s2.length()) {
                    if(s1.charAt(i) == s2.charAt(j)) {
                        i++;
                        j++;
                    }else{
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    return true;
                }
            }
        }
        return false;
    }
}
package demo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo103 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 4 rows of letters separated by spaces: ");
        char[][] m = new char[4][4];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = scan.next().charAt(0);
            }
        }
        System.out.println(isLatinSquare(m));
        scan.close();
    }

    public static boolean isLatinSquare(char[][] m) {
        for (char[] chars : m) {
            Set<Character> set = new HashSet<>();
            for (char aChar : chars) {
                if (aChar >= 'A' + 4) {
                    return false;
                } else {
                    if (!set.add(aChar)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

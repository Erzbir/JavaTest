package demo;

import java.util.Scanner;

class Demo99 {
    private static String[][] chess;
    private static int position_x;
    private static int position_y;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        init();
        display();
        while (true) {
            System.out.print("Drop a red disk: ");
            position_x = scan.nextInt();
            position_y = scan.nextInt();
            try {
                game(true);
            } catch (Exception e) {
                System.out.println();
                e.printStackTrace();
                continue;
            }
            if (isWin()) {
                System.out.println("player wins");
                break;
            }
            try {
                AI();
            } catch (Exception e) {
                System.out.println();
                e.printStackTrace();
            }
            if (isWin()) {
                System.out.println("AI wins");
                break;
            }
        }
        scan.close();
    }

    public static void init() {
        chess = new String[6][7];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                chess[i][j] = "|";
            }
        }

    }

    public static void display() {
        for (String[] str : chess) {
            for (String s : str) {
                System.out.print(s + " \t");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }

    public static void game(boolean flag) {
        if (position_x >= chess.length || position_y >= chess[0].length) {
            throw new RuntimeException("out of range!");
        }
        if (!chess[position_x][position_y].equals("|")) {
            throw new RuntimeException("there already have a disk!");
        }
        chess[position_x][position_y] = flag ? "0" : "1";
        display();
    }

    public static void AI() {
        while (!chess[position_x][position_y].equals("|")) {
            position_x = (int) (Math.random() * chess.length);
            position_y = (int) (Math.random() * chess[0].length);
        }
        game(false);
    }

    public static boolean isWin() {
        int x = position_x;
        int y = position_y;
        int count = 0;
        for (int i = x, j = x; i >= 0 || j < chess.length; ) {
            if (i >= 0 && chess[i][position_y].equals(chess[position_x][position_y])) {
                count++;
            } else if (j < chess.length && chess[j][position_y].equals(chess[position_x][position_y])) {
                count++;
            } else {
                break;
            }
            if (count > 3) {
                return true;
            }
            if (i >= 0) {
                i--;
            }
            if (j < chess.length) {
                j++;
            }
        }
        count = 0;
        for (int i = y, j = y; i >= 0 || j < chess[0].length; ) {
            if (i >= 0 && chess[position_x][i].equals(chess[position_x][position_y])) {
                count++;
            } else if (j < chess[0].length && chess[position_x][j].equals(chess[position_x][position_y])) {
                count++;
            } else {
                break;
            }
            if (count > 3) {
                return true;
            }
            if (i >= 0) {
                i--;
            }
            if (j < chess[0].length) {
                j++;
            }
        }
        count = 0;
        for (int i = x, j = y, m = x, n = y; i >= 0 && j >= 0 || m < chess.length && n < chess[0].length; ) {
            if (i >= 0 && j >= 0 && chess[i][j].equals(chess[position_x][position_y])) {
                count++;
            } else if (m < chess.length && n < chess[0].length && chess[m][n].equals(chess[position_x][position_y])) {
                count++;
            } else {
                break;
            }
            if (count > 3) {
                return true;
            }
            if (i >= 0) {
                i--;
            }
            if (j >= 0) {
                j--;
            }
            if (m < chess.length) {
                m++;
            }
            if (n < chess[0].length) {
                n++;
            }
        }
        count = 0;
        for (int i = x, j = y, m = x, n = y; i < chess.length && j >= 0 || m >= 0 && n < chess[0].length; ) {
            if (i < chess.length && j >= 0 && chess[i][j].equals(chess[position_x][position_y])) {
                count++;
            } else if (m >= 0 && n < chess[0].length && chess[m][n].equals(chess[position_x][position_y])) {
                count++;
            } else {
                break;
            }
            if (count > 3) {
                return true;
            }
            if (i < chess.length) {
                i++;
            }
            if (j >= 0) {
                j--;
            }
            if (m >= 0) {
                m--;
            }
            if (n < chess[0].length) {
                n++;
            }
        }


        return false;
    }
}
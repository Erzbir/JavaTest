package demo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author:HENG
 * @Date:2022/7/4 14:24
 */
//五子棋游戏
public class Demo99 {
    public static char[][] board;
    public static int player = 0;   //通过奇偶性来决定黑白 统计下棋的棋子数
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //1.初始化棋盘
        initalBoard();
        //2.打印棋盘
        printBoard();
        //3.开始游戏
        startGame();
    }

    private static void startGame() {
        while (!isGameOver()) {
            if (player % 2 == 0) {
                System.out.println(">>>黑方");
                chessBoard('O');
            } else {
                System.out.println(">>>白方");
                chessBoard('X');
            }
            player++;
        }
        if (player % 2 == 0) {
            System.out.println(">>>白方胜!!!");
        } else {
            System.out.println(">>>黑方胜!!!");
        }
        System.out.println(">>>游戏结束！");
    }

    private static boolean isGameOver() {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] != '+') {
                    //向右
                    if (c < 11) {
                        if (board[r][c] == board[r][c + 1] && board[r][c] == board[r][c + 2] && board[r][c] == board[r][c + 3] && board[r][c] == board[r][c + 4]) {
                            return true;
                        }
                    }
                    //向下
                    if (r < 11) {
                        if (board[r][c] == board[r + 1][c] && board[r][c] == board[r + 2][c] && board[r][c] == board[r + 3][c] && board[r][c] == board[r + 4][c]) {
                            return true;
                        }
                    }
                    //向右下
                    if (r < 11 && c < 11) {
                        if (board[r][c] == board[r + 1][c + 1] && board[r][c] == board[r + 2][c + 2] && board[r][c] == board[r + 3][c + 3] && board[r][c] == board[r + 4][c + 4]) {
                            return true;
                        }
                    }
                    //向右上
                    if (r > 3 && c < 11) {
                        if (board[r][c] == board[r - 1][c + 1] && board[r][c] == board[r - 2][c + 2] && board[r][c] == board[r - 3][c + 3] && board[r][c] == board[r - 4][c + 4]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static void chessBoard(char chess) {
        System.out.print(">>>输入下棋的位置:");
        int x = input.nextInt() - 1;
        int y = input.nextInt() - 1;
        if (board[x][y] != '+') {
            System.out.println(">>>此处已有棋子，请重新下棋!");
            player--;
            return;
        }
        board[x][y] = chess;
        printBoard();
    }

    private static void printBoard() {
        System.out.print("   ");
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%-3d", i);
        }
        System.out.println();

        for (int i = 0; i < board.length; i++) {
            System.out.printf("%-3d", (i + 1));
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static void initalBoard() {
        board = new char[15][15];
        for (char[] chars : board) {
            Arrays.fill(chars, '+');
        }
    }
}
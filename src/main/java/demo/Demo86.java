package demo;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Demo86 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of balls to drop:");
        int beanNums = input.nextInt();
        System.out.println("Enter the number of slots in the bean machine:");
        int slots = input.nextInt();
        showAnswer(beanNums, slots);
    }

    public static void showAnswer(int beanNums, int slots) {
        int direction;
        int[] Dir = new int[beanNums];
        int[][] Slo = new int[slots][beanNums];

        // 一个球一个球往下滚
        for (int i = 0; i < beanNums; ++i) {

            // 钉子行数比槽数少1
            for (int j = 0; j < slots - 1; ++j) {

                // direction表示小球向左或向右，取随机数0或1
                direction = (int) (Math.random() * 2);

                //当direction为0时，记作向左；为1时，记作向右。Dir[i]为第i个小球滚动过程中有几次向右滚。
                if (direction == 0) {
                    System.out.print("L");

                } else {
                    System.out.print("R");
                    Dir[i]++;
                }
            }
            System.out.println();
        }

        for (int j = 0; j < slots - 1; ++j) {

            //Slo[j][count]表示第j个槽由下往上数有多少个球
            int count = beanNums - 1;

            for (int i = 0; i < beanNums; ++i) {

                if (Dir[i] == j) {
                    Slo[j][count] = 1;
                    count--;
                }

            }
        }

        //显示各槽情况
        for (int i = 0; i < beanNums; ++i) {

            // 钉子行数比槽数少1
            for (int j = 0; j < slots - 1; ++j) {

                if (Slo[j][i] == 1) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static List<Integer> s() {
        return new LinkedList<>();
    }


}
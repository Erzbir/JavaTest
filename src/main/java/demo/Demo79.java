package demo;

/**
 * @Author:HENG
 * @Date:2022/7/4 13:40
 */
public class Demo79 {
    public static void main(String[] args) {
        String start = "A";
        String mid = "B";
        String end = "C";
        int level = 3;
        hanoi(level, start, mid, end);
    }

    private static void hanoi(int level, String start, String mid, String end) {
        if (level == 1) {
            System.out.println(start + "->" + end);
        } else {
            hanoi(level - 1, start, end, mid);
            System.out.println(start + "->" + end);
            hanoi(level - 1, mid, start, end);
        }
    }
}
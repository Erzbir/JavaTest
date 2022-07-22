package practise;

public class Test_56 {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        System.out.printf("从左上到右下有 %d种 走法", count(arr));
    }

    private static int count(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 1;
        }
        for (int i = 0; i < arr[0].length; i++) {
            arr[0][i] = 1;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
            }
        }
        return arr[arr.length - 1][arr[0].length - 1];
    }
}
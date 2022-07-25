package practise;

public class Test_66 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 4, 4, 3, 1, 2, 3, 3, 6, 7, 8, 9, 9, 9, 9, 10};
        System.out.println(count(arr));

    }

    public static int count(int[] arr) {
        int n = 1;
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (res == arr[i]) {
                n++;
            }
            else {
                n--;
                if (n == 0) {
                    res = arr[i];
                    n = 1;
                }
            }

        }
        return n;
    }
}
package practise;

public class Test_14 {
    public static void main(String[] args) {
        for (int i = 400, j = 500; i <= j; i++, j--) {
            if (i % 2 == 1 && i % 5 == 3 && i % 9 == 1) {
                System.out.println(i);
                break;
            } else if (j % 2 == 1 && j % 5 == 3 && j % 9 == 1) {
                System.out.println(j);
                break;
            }
        }
    }
}

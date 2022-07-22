package practise;

public class Test_13 {
    public static void main(String[] args) {
        for (int i = 18; i < 100; i++) {
            if ((i + 3) % 5 == 0 && (i - 3) % 6 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}

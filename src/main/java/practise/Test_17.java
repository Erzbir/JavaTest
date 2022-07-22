package practise;

public class Test_17 {
    public static void main(String[] args) {
        for (int i = 560; i < 10000; i++) {
            if ((i / 80) % 7 == 0 && i % 4 == 1 && i % 5 == 1 && i % 6 == 1) {
                System.out.println(i);
            }
        }
    }
}

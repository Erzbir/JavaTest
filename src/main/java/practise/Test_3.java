package practise;

public class Test_3 {
    public static void main(String[] args) {
        int totalScore = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("输入第" + i + "个数:");
            int score = PrintPatten.input.nextInt();
            totalScore += score;
        }
        System.out.println("平均分: " + totalScore / 5);
    }
}

package practise;

public class Test_27 {
    public static void main(String[] args) {
        System.out.print("输入文件路径:");
        String path = PrintPatten.input.nextLine();
        String[] temp = path.split("\\.");
        String result = temp[temp.length - 1];
        System.out.println(result);
    }
}

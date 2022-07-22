package practise;

public class Test_32 {
    public static void main(String[] args) {
        String str = "哈呵呵哈哈呵dwqqdwq呵";
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).compareTo("呵") == 0) {
                System.out.println("index:" + i);
            }

        }
    }
}

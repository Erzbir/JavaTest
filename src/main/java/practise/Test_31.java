package practise;

public class Test_31 {
    public static void main(String[] args) {
        String str = "http://www.163.com?userName=admin&pwd=123456";
        StringBuilder result_1 = new StringBuilder();
        StringBuilder result_2 = new StringBuilder();
        str = str.replace("://", "@");
        str = str.replaceAll("[/.\\?]", ".");
        int i = str.lastIndexOf("@") + 1;
        int j = str.lastIndexOf(".") - 1;
        int m = str.indexOf("&") - 1;
        int n = str.indexOf("=") + 1;
        for (; i <= j; i++) {
            result_1.append(str.charAt(i));
        }
        for (; n <= m; n++) {
            result_2.append(str.charAt(n));
        }
        System.out.println(result_1);
        System.out.println(result_2);
    }
}

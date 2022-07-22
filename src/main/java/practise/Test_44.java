package practise;

public class Test_44 {
    public static void main(String[] args) {
        System.out.print("输入十进制数:");
        int dec = PrintPatten.input.nextInt();
        System.out.println(decToHex(dec));
    }

    public static String decToHex(int dec) {
        String hex = "";
        char temp;
        int hex_value;
        while (dec != 0) {
            hex_value = dec % 16;
            temp = hex_value <= 9 && hex_value >= 0 ? (char) (hex_value + '0') : (char) (hex_value - 10 + 'A');
            hex = temp + hex;
            dec /= 16;
        }
        return hex;
    }
}

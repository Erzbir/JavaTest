package practise;

public class Test_63 {
    public static void main(String[] args) {
        MyInteger integer = new MyInteger(10);

        System.out.println(integer.equals(10));
        System.out.println(integer.equals(new MyInteger(10)));
        System.out.println(integer.isEven());
        System.out.println(integer.isOdd());
        System.out.println(integer.isPrime());
        System.out.println(integer.getValue());
        integer.setValue(100);
        System.out.println(integer.getValue());
        System.out.println(integer);
        System.out.println(MyInteger.toInteger(new char[]{'1', '2', '3'}));
        System.out.println(MyInteger.toInteger("123"));
        System.out.println(MyInteger.BinaryToDecimal(100));
        System.out.println(MyInteger.DecimalToBinary(2));
        System.out.println(MyInteger.decimalToHexadecimal(16));
    }
}

class MyInteger {
    private int value;

    public MyInteger() {

    }

    public MyInteger(int num) {
        this.value = num;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

    public void setValue(int num) {
        this.value = num;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isEven() {
        return this.value % 2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public boolean isPrime() {
        if (this.value < 2) {
            return false;
        }
        for (int i = 2; i < this.value / 2 - this.value % 2; i++) {
            if (this.value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(int num) {
        return this.value == num;
    }

    public boolean equals(MyInteger integer) {
        return this.value == integer.value;
    }

    public static int toInteger(char[] s) {
        if (s == null || s.length < Character.MIN_RADIX || s.length > Character.MAX_RADIX) {
            throw new NumberFormatException("超出范围");
        }

        int num = 0;

        for (int i = s.length - 1, j = 0; i >= 0; i--, j++) {
            int temp = s[i] - '0';
            num += temp * Math.pow(10, j);
        }
        return num;
    }

    public static int toInteger(String s) {
        if (s == null || s.length() < Character.MIN_RADIX || s.length() > Character.MAX_RADIX) {
            throw new NumberFormatException("超出范围");
        }

        int num = 0;

        for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {
            int temp = s.charAt(i) - '0';
            num += temp * Math.pow(10, j);
        }
        return num;
    }

    public static int DecimalToBinary(int dec) {
        int binary = 0;
        int count = 0;

        if (dec < 2) {
            return dec;
        }
        while (dec > 0) {
            binary += (dec % 2) * (int) Math.pow(10, count++);
            dec >>= 1;
        }
        return binary;
    }

    public static int BinaryToDecimal(int binary) {
        int dec = 0;
        int count = 0;

        while (binary > 0) {
            int temp = binary % 10;
            dec += temp * Math.pow(2, count++);
            binary /= 10;
        }
        return dec;
    }

    public static String decimalToHexadecimal(int dec) {
        final char[] HEX_MAP = {'0', '1', '2', '3', '4', '5', '6', '7', '8',
                '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        final int SizeOfIntInHalfBytes = 8;
        final int NumberOfBitsInAHalfByte = 4;
        final int HalfByte = 0x0F;

        StringBuilder hexBuilder = new StringBuilder(SizeOfIntInHalfBytes);
        hexBuilder.setLength(SizeOfIntInHalfBytes);
        for (int i = SizeOfIntInHalfBytes - 1; i >= 0; --i) {
            int j = dec & HalfByte;
            hexBuilder.setCharAt(i, HEX_MAP[j]);
            dec >>= NumberOfBitsInAHalfByte;
        }
        return hexBuilder.toString();
    }
}
package practise;

public class Test_64 {
    public static void main(String[] args) {
        MyString myString_1 = new MyString(new char[]{'a', 'B', 'C'});
        MyString myString_2 = new MyString(new char[]{'a', 'B', 'C'});
        MyString myString_3 = new MyString();
        System.out.println(myString_1.getString());
        System.out.println(myString_1);
        myString_3.setValue(new char[]{'1', '1', '1'});
        System.out.println(myString_3);
        System.out.println(myString_1.equals(myString_2));
        System.out.println(myString_1.getString());
        System.out.println(myString_1.charAt(1));
        System.out.println(myString_1.toLow());
        System.out.println(myString_1.toUpper());
        System.out.println(MyString.valueOf(1123));
    }
}

class MyString {
    private char[] value;

    public MyString() {
        this.value = new char[0];
    }

    public MyString(char[] s) {
        this.value = s;
    }

    public static MyString valueOf(double num) {
        int temp = (int) num;
        String s = "" + temp;
        char[] s_2 = new char[s.length()];
        int i = s.length() - 1;
        while (temp > 0) {
            s_2[i--] = (char) (temp % 10 + '0');
            temp /= 10;
        }
        return new MyString(s_2);
    }

    public static MyString valueOf(char[] s) {
        return new MyString(s);
    }

    public void setValue(char[] s) {
        this.value = s;
    }

    public void setValue(MyString s) {
        this.value = s.value;
    }

    public char[] getString() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

    public int length() {
        return this.value.length;
    }

    public boolean equals(MyString s) {
        if (this.length() != s.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != this.value[i]) {
                return false;
            }
        }
        return true;
    }

    public char charAt(int index) {
        if (index > this.value.length) {
            throw new ArrayIndexOutOfBoundsException("下标越界");
        }
        return this.value[index];
    }

    public MyString toUpper() {
        char[] newStr = new char[this.value.length];

        for (int i = 0; i < this.length(); i++) {
            if (this.value[i] >= 90 && this.value[i] <= 112) {
                newStr[i] = (char) (this.value[i] - 32);
            } else {
                newStr[i] = this.value[i];
            }
        }
        return new MyString(newStr);
    }

    public MyString toLow() {
        char[] newStr = new char[this.value.length];

        for (int i = 0; i < this.length(); i++) {
            if (this.value[i] >= 65 && this.value[i] <= 90) {
                newStr[i] = (char) (this.value[i] + 32);
            } else {
                newStr[i] = this.value[i];
            }
        }
        return new MyString(newStr);
    }

}
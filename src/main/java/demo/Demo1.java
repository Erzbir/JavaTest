package demo;

class Demo1 {
    int a;
    double b;
    char c;
    String d;

    public static void main(String[] args) {
        int x = 1000;
        Integer a = 1000;
        Integer b = Integer.valueOf(1000);
        Integer c = Integer.valueOf(1000).intValue();
        Integer d = Integer.parseInt("1000");
        System.out.println(d == x);
    }

    @Override
    public String toString() {
        return a + " " + b + " " + c + " " + d;
    }
}

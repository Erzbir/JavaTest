package practise;

public class Test_58 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("alice", "white", (byte) 3);
        Cat cat2 = new Cat("policat", "black", (byte) 4);
        Person master = new Person("oik", (byte) 18);
        cat1.master = master;
        cat2.master = master;
        master.cats = new Cat[]{cat1, cat2};
        System.out.printf("cat1的名字是: %s, 颜色是: %s, 年龄是: %d, 主人是 %s\n", cat1.name, cat1.color, cat1.age, cat1.master.name);
        System.out.printf("cat2的名字是: %s, 颜色是: %s, 年龄是: %d, 主人是 %s\n", cat2.name, cat2.color, cat2.age, cat2.master.name);
        System.out.printf("姓名: %s, 年龄 %d, 养的猫: %s  %s", master.name, master.age, master.cats[0].name, master.cats[1].name);

    }
}

class Cat {
    String name;
    String color;
    byte age;
    Person master;

    public Cat(String name, String color, byte age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
}

class Person {
    String name;
    byte age;
    Cat[] cats;

    public Person(String name, byte age) {
        this.name = name;
        this.age = age;
    }
}

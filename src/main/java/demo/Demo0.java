package demo;

class Demo0 implements Cloneable{

    User user;

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        Demo0 test = new Demo0(user);
        Demo0 test2 = null;
        Demo0 test3 = null;
        test2 = (Demo0) test.clone();
        System.out.println(test == test2);
        System.out.println(test.user == test2.user);
        test3 = (Demo0) test.clone();
        System.out.println(test == test3);
        System.out.println(test.user == test3.user);
    }

    public Demo0(User user) {
        this.user = user;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        this.user = (User) this.user.clone();
        return super.clone();

    }
}

class User implements Cloneable{

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
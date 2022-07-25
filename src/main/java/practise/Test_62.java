package practise;

import java.util.Scanner;

public class Test_62 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        UserTest userTest = new UserTest();
        byte select;
        while (true) {
            Menu();
            System.out.print("输入你的选项:");
            select = scan.nextByte();
            if (select == 1) {
                if (signUp(userTest)) {
                    System.out.println("\t\t\t注册成功");
                } else {
                    System.out.println("\t\t\t注册失败");
                }
            }
            else if (select == 2) {
                if(signIn(userTest)) {
                    System.out.println("\t\t\t登录成功");
                }
                else {
                    System.out.println("\t\t\t登录失败");
                }
            }
            else {
                break;
            }
        }
        scan.close();
    }

    public static boolean signUp(UserTest userTest) {
        scan.nextLine();
        System.out.print("输入用户名:");
        String userName = scan.nextLine();
        if (!userTest.isCanRegister(userName)) {
            System.out.println("\t\t\t已存在该账户");
            return false;
        }
        System.out.print("输入密码:");
        String tempPassword = scan.nextLine();
        System.out.print("确认密码:");
        String secondPassword = scan.nextLine();
        if (!userTest.comparePassword(tempPassword, secondPassword)) {
            System.out.println("\t\t\t两次密码输入不同");
            return false;
        }
        userTest.register(userName, tempPassword);
        return true;
    }

    public static boolean signIn(UserTest userTest) {
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.print("输入用户名:");
        String userName = scan.nextLine();
        if (userTest.isCanRegister(userName)) {
            System.out.println("\t\t\t不存在该账户");
            return false;
        }
        System.out.print("输入密码:");
        String password = scan.nextLine();
        for (i = 0; !userTest.getUsers()[i].getUserName().equals(userName); i++) ;
        if (!userTest.getUsers()[i].getPassword().equals(password)) {
            System.out.println("\t\t\t密码错误");
            return false;
        }
        return true;
    }

    public static void Menu() {
        System.out.println("\n\t\t\t0.退出");
        System.out.println("\t\t\t1.注册");
        System.out.println("\t\t\t2.登录");
    }


}

class UserTest {

    private Admin[] users = new Admin[100];
    private static int count = 0;


    static class Admin {
        private String userName = "0";
        private String password = "0";

        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }
    }


    private void setUser(String userName, String password) {
        Admin admin = new Admin();
        admin.userName = userName;
        admin.password = password;
        if (count > 99) {
            this.expend();
        }
        this.users[count++] = admin;


    }

    private void expend() {
        this.users = new Admin[users.length + 1];
    }

    Admin[] getUsers() {
        return this.users;
    }



    boolean isCanRegister(String userName) {
        if (count == 0) {
            return true;
        }
        for (int i = 0; i < count; i++) {
            if (this.users[i].userName.equals(userName)) {
                return false;
            }
        }
        return true;
    }

    boolean comparePassword(String password_1, String password_2) {
        return password_1.equals(password_2);
    }

    public void register (String userName, String password) {
        setUser(userName, password);
    }
}
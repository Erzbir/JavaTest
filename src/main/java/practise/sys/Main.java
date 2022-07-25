package practise.sys;

import java.util.Scanner;

public class Main {
    static MenuInter menu_1;
    static MenuInter menu_2;
    static UserInter user;
    static BlogInter blog;

    static Users.User loginUser;

    public static void main(String[] args) {
        init();
        Scanner scan = new Scanner(System.in);
        String n;
        while (true) {
            boolean flag = false;
            menu_1.display();
            n = menu_1.enterChoice();
            if (n.equals("0")) {
                System.out.println("已退出");
                return;
            }
            if (n.equals("1")) {
                System.out.print("输入用户名:");
                String account = scan.next();
                System.out.print("输入密码:");
                String password = scan.next();
                System.out.print("确认密码:");
                String rePassword = scan.next();
                if (!user.signUp(account, password, rePassword)) {
                    System.out.println("注册失败");
                } else {
                    System.out.println("注册成功");
                }
            } else if (n.equals("2")) {
                System.out.print("输入用户名:");
                String account = scan.next();
                System.out.print("输入密码:");
                String password = scan.next();
                if (!user.signIn(account, password)) {
                    System.out.println("登录失败");
                } else {
                    flag = true;
                    System.out.println("登录成功");
                    loginUser = user.getUser(account);
                }
            }
            while (flag) {
                menu_2.display();
                n = menu_2.enterChoice();
                if (n.equals("0")) {
                    System.out.println("已退出");
                    flag = false;
                }
                if (n.equals("1")) {
                    loginUser.getBlog().writeArticle();
                    System.out.println("写入完成");
                }
                if (n.equals("2")) {
                    System.out.print("输入文章名:");
                    String title = scan.next();
                    if (!loginUser.getBlog().viewArticle(title)) {
                        System.out.println("查看失败");
                    } else {
                        System.out.println("查看成功");
                    }
                }
                if (n.equals("3")) {
                    if (!loginUser.getBlog().releaseArticle()) {
                        System.out.println("发布失败");
                    } else {
                        System.out.println("发布成功");
                    }
                }
            }
        }
    }

    public static void init() {
        menu_1 = new Menu("0 1 2", "退出 注册 登录");
        menu_2 = new Menu("0 1 2 3", "退出 编辑 查看 发布");
        user = new Users();
    }
}

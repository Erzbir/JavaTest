package practise;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;


public class Test_67 {
    public static void main(String[] args) {

    }
}

interface Admin {

    boolean signUp(String account, String password, String rePassword);

    boolean signIn(String account, String password);

    boolean checkAccount(String account);

    boolean checkPassword(String password_1, String password_2);

    boolean isElemEmpty(String account, String password);
}

interface BlogInter {
    void writeArticle();

    void releaseArticle();

    void viewArticle(String title);

}

interface MenuInter {
    int enterChoice();

    int equalChoice();
}

class Menu implements MenuInter {

    @Override
    public int enterChoice() {
        return 0;
    }

    @Override
    public int equalChoice() {
        return 0;
    }
}

@Getter
@Setter
class Blog implements BlogInter {

    private String id;

    private static List<Article> articles = new ArrayList<>(100);
    private Users.User user;
    private Blog.Article article;

    @Getter
    @Setter
    class Article {
        private String id;
        private String title;
        private String author;
        private String content;
        private LocalTime publishTime;
    }

    public Blog(Users.User user) {
        this.user = user;
    }

    public Blog() {

    }

    @Override
    public void writeArticle() {
        this.article = new Article();
        StringBuilder tempContent = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        System.out.println("输入i进入编辑, 输入!exit返回命令模式, :q退出, :保存");

        while (true) {
            String temp1 = scan.nextLine();
            if (temp1.equals(":q")) {
                return;
            }
            if (temp1.equals(":w")) {
                article.content = String.valueOf(tempContent);
            }
            if (temp1.equals("i")) {
                flag = true;
            }
            while (flag) {
                System.out.println("\t----------------开始编辑-----------------");
                String temp2 = scan.nextLine();
                if (temp2.equals("!exit")) {
                    flag = false;
                    break;
                }
                tempContent.append(temp2);
            }

        }
    }

    @Override
    public void releaseArticle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入文章标题:");
        this.article.title = scan.nextLine();
        this.article.id = this.id;
        this.article.author = user.getAccount();
        this.article.publishTime = LocalTime.now();
        articles.add(this.article);
    }

    @Override
    public void viewArticle(String title) {
        int i;
        Article article1 = new Article();
        for (i = 0; i < articles.size(); i++) {
            if (articles.get(i).title.equals(title)) {
                article1 = articles.get(i);
                break;
            }
        }
        System.out.printf("作者: %s    发布时间: %s\n内容:\n%s", article1.author, article1.publishTime, article1.content);
    }
}

@Setter
@Getter
class Users implements Admin {
    private static List<User> userList = new ArrayList<>(100);

    @Getter
    @Setter
    class User {
        private String id;
        private String account;
        private String password;

        public User() {

        }

    }

    @Override
    public boolean signUp(String account, String password, String rePassword) {
        if (!checkAccount(account) || !checkPassword(password, rePassword)) {
            return false;
        }
        User user = new User();
        user.id = UUID.randomUUID().toString();
        user.account = account;
        user.password = password;
        userList.add(user);
        return true;
    }

    @Override
    public boolean signIn(String account, String password) {
        if (userList.isEmpty()) {
            return false;
        }
        if (isElemEmpty(account, password)) {
            return false;
        }
        User user = null;
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).account.equals(account)) {
                user = userList.get(i);
                break;
            }
            if (i == userList.size() - 1) {
                return false;
            }
        }
        assert user != null;
        return user.password.equals(password);
    }

    @Override
    public boolean checkAccount(String account) {
        if (account == null) {
            return false;
        }
        for (User user : userList) {
            if (user.account.equals(account)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean checkPassword(String password_1, String password_2) {
        return password_1.length() < 18 && password_1.equals(password_2);
    }

    public boolean isElemEmpty(String account, String password) {
        return account == null || password == null;
    }

}



package practise;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.*;


interface UserInter {

    boolean signUp(String account, String password, String rePassword);

    boolean signIn(String account, String password);

    boolean checkAccount(String account);

    boolean checkPassword(String password_1, String password_2);

    Users.User getUser(String account);

}

interface BlogInter {
    void writeArticle();

    void releaseArticle();

    void viewArticle(String title);

}

interface MenuInter {
    String enterChoice();

    void display();

    void setMenu(String ids, String contents);
}

public class Test_67 {
    static MenuInter menu_1;
    static MenuInter menu_2;
    static UserInter user;
    static BlogInter blog;

    public static void main(String[] args) {
        init();
        Scanner scan = new Scanner(System.in);
        String n = "";
        while (!n.equals("0")) {
            boolean flag = false;
            menu_1.display();
            n = menu_1.enterChoice();
            if (n.equals("1")) {
                System.out.print("输入用户名:");
                String account = scan.next();
                System.out.print("输入密码:");
                String password = scan.next();
                System.out.print("确认密码:");
                String rePassword = scan.next();
                if (!user.signUp(account, password, rePassword)) {
                    System.out.println("注册失败");
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
                    blog = new Blog(user.getUser(account));
                    System.out.println("登录成功");
                }
            }
            if (!flag) {
                continue;
            }
            menu_2.display();
            n = menu_2.enterChoice();
            if (n.equals("0")) {
                System.out.println("已退出");
                continue;
            }
            if (n.equals("1")) {
                blog.writeArticle();
                System.out.println("写入成功");
            }
            if (n.equals("2")) {
                System.out.print("输入文章名:");
                String title = scan.next();
                blog.viewArticle(title);
                System.out.println("查看成功");
            }
            if (n.equals("3")) {
                blog.releaseArticle();
                System.out.println("发布成功");
            }
        }
    }

    public static void init() {
        menu_1 = new Menu("0 1 2", "退出 注册 登录");
        menu_2 = new Menu("0 1 2 3", "退出 编辑 查看 发布");
        user = new Users();
    }
}

@Setter
@Getter
class Menu implements MenuInter {
    private String[] id;
    private String[] content;
    private Dictionary<String, String> dictionary = new Hashtable<>();


    public Menu(String ids, String contents) {
        this.id = ids.split(" ");
        this.content = contents.split(" ");
        if (content.length != id.length) {
            return;
        }
        for (int i = 0; i < id.length; i++) {
            this.dictionary.put(id[i], content[i]);
        }
    }

    public Menu() {

    }

    @Override
    public String enterChoice() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n输入选项: ");
        return scan.next();
    }

    @Override
    public void display() {
        for (int i = 0; i < dictionary.size(); i++) {
            System.out.printf("\t\t%s.%s", i, dictionary.get(String.valueOf(i)));
        }
    }

    @Override
    public void setMenu(String ids, String contents) {
        this.id = ids.split(" ");
        this.content = contents.split(" ");
        if (content.length != id.length) {
            return;
        }
        for (int i = 0; i < id.length; i++) {
            this.dictionary.put(id[i], content[i]);
        }
    }

}

@Getter
@Setter
class Blog implements BlogInter {

    private String id;

    private List<Article> articleList = new ArrayList<>(100);
    private Users.User user;
    private Blog.Article article;

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
        if (this.article == null) {
            return;
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("输入文章标题:");
        this.article.title = scan.nextLine();
        this.article.id = this.id;
        this.article.author = user.getAccount();
        this.article.publishTime = LocalTime.now();
        articleList.add(this.article);
    }

    @Override
    public void viewArticle(String title) {
        if (title == null) {
            return;
        }
        if (articleList.isEmpty()) {
            return;
        }
        int i;
        Article article1 = new Article();
        for (i = 0; i < articleList.size(); i++) {
            if (articleList.get(i).title.equals(title)) {
                article1 = articleList.get(i);
                break;
            }
        }
        System.out.printf("作者: %s    发布时间: %s\n内容:\n%s\n", article1.author, article1.publishTime, article1.content);
    }

    public boolean isElemEmpty(String str1, String str2) {
        return str1 == null || str2 == null;
    }

    @Getter
    @Setter
    class Article {
        private String id;
        private String title;
        private String author;
        private String content;
        private LocalTime publishTime;
    }
}

@Setter
@Getter
class Users implements UserInter {

    private HashMap<String, User> userList = new HashMap<>(100);

    @Override
    public boolean signUp(String account, String password, String rePassword) {
        if (checkAccount(account) || !checkPassword(password, rePassword)) {
            return false;
        }
        User user = new User();
        user.id = UUID.randomUUID().toString();
        user.account = account;
        user.password = password;
        userList.put(account, user);
        return true;
    }

    @Override
    public boolean signIn(String account, String password) {
        if (isElemEmpty(account, password)) {
            return false;
        }
        if (userList.isEmpty()) {
            return false;
        }
        User user = userList.get(account);
        if (!checkAccount(account)) {
            return false;
        }
        return user.password.equals(password);
    }

    @Override
    public boolean checkAccount(String account) {
        if (account == null) {
            return false;
        }
        return userList.containsKey(account);
    }

    @Override
    public boolean checkPassword(String password_1, String password_2) {
        if (isElemEmpty(password_1, password_2)) {
            return false;
        }
        return password_1.length() < 18 && password_1.equals(password_2);
    }

    private boolean isElemEmpty(String str1, String str2) {
        return str1 == null || str2 == null;
    }

    @Override
    public User getUser(String account) {
        return userList.get(account);
    }

    @Getter
    @Setter
    class User {
        private String id;
        private String account;
        private String password;

        public User() {

        }

    }
}



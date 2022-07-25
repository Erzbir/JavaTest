package practise.sys;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        this.article = new Blog.Article();
        StringBuilder tempContent = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        System.out.print("输入i进入编辑, 输入!exit返回命令模式, :q退出, :w保存:");
        while (true) {
            String temp1 = scan.nextLine();
            if (temp1.equals(":q")) {
                System.out.println("已退出");
                return;
            }
            if (temp1.equals(":w")) {
                System.out.println("已保存");
                article.content = String.valueOf(tempContent);
            }
            if (temp1.equals("i")) {
                flag = true;
            }
            if (flag) {
                System.out.println("\t----------------开始编辑-----------------");
            }
            while (flag) {
                String temp2 = scan.nextLine();
                if (temp2.equals("!exit")) {
                    flag = false;
                    System.out.println("已退出");
                    break;
                }
                tempContent.append(temp2);
            }

        }
    }

    @Override
    public boolean releaseArticle() {
        if (this.article == null) {
            return false;
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("输入文章标题:");
        this.article.title = scan.nextLine();
        this.article.id = this.id;
        this.article.author = user.getAccount();
        this.article.publishTime = LocalTime.now();
        articleList.add(this.article);
        return true;
    }

    @Override
    public boolean viewArticle(String title) {
        if (title == null) {
            return false;
        }
        if (articleList.isEmpty()) {
            return false;
        }
        int i;
        Blog.Article article1 = new Blog.Article();
        for (i = 0; i < articleList.size(); i++) {
            if (articleList.get(i).title.equals(title)) {
                article1 = articleList.get(i);
                break;
            }
        }
        System.out.printf("作者: %s    发布时间: %s\n内容:\n%s\n", article1.author, article1.publishTime, article1.content);
        return true;
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
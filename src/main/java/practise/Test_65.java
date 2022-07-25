package practise;

import lombok.Getter;
import lombok.Setter;

public class Test_65 {
    public static void main(String[] args) {
        Reply reply = new Reply();
    }
}

@Getter
@Setter
class Board {
    private int id;
    private String boardName;

    public Board() {

    }

    public Board(int id, String board_name) {
        this.id = id;
        this.boardName = board_name;
    }

}

@Getter
@Setter
class Article {
    private int id;
    private String content;
    private Author author;
    private Board board;

    public Article() {

    }

    public Article(int id, String content, Author author, Board board) {
        this.id = id;
        this.content = content;
        this.author = author;
        this.board = board;
    }
}

@Getter
@Setter
class Author {
    private int id;
    private String name;
    private String intro;
    private String address;
    private Board board;

    public Author() {

    }

    public Author(int id, String name, String intro, String address, Board board) {
        this.id = id;
        this.name = name;
        this.intro = intro;
        this.address = address;
        this.board = board;
    }
}

@Getter
@Setter
class Reply {
    private Node head = null;
    private Article article;

    public Reply() {

    }

    public Reply(Node head, Article article) {
        this.head = head;
        this.article = article;
    }

    @Setter
    @Getter
    private static class Data {
        private int id;
        private int fatherId;
        private Author user;
        private String date;
        private Object content;

        public Data() {

        }

        public Data(int id, int fatherId, Author user, String date, Object content) {
            this.id = id;
            this.fatherId = fatherId;
            this.user = user;
            this.date = date;
            this.content = content;
        }
    }

    @Setter
    @Getter
    private static class Node {

        private Node next;
        private Data data;

        public Node() {

        }

        public Node(Data data) {
            this.data = data;
        }
    }
}
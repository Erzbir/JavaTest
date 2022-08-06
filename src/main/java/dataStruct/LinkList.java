package dataStruct;

public class LinkList {
    private Node head = null;

    private Node rear = null;

    public LinkList() {

    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.add(1);
        list.add(2);
        System.out.println("链表的长度是:" + list.length());
        System.out.println("链表当前的元素:" + list);
        list.delete(1);
        System.out.println("删除后的链表元素:" + list);
    }

    // append方法
    public void add(Object data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // 在index元素后插入
    public void insert(Object data, int index) {
        Node temp = head;
        Node newNode = new Node(data);
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 删除方法
    public boolean delete(int index) {
        if (this.head == null && index < 0) {
            return false;
        }
        if (index == 0) {
            assert this.head != null;
            this.head = this.head.next;
        }
        Node temp = this.head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = null;
        return true;
    }

    //获取长度
    public int length() {
        Node temp = this.head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node temp = this.head;
        while (temp != null) {
            result.append(temp.data.toString()).append(" ");
            temp = temp.next;
        }
        return result.toString();
    }

    // 节点定义成一个内部类
    private class Node {
        Object data = null;
        Node next = null;

        private Node(Object data) {
            this.data = data;
        }

        private Node() {

        }

    }


}



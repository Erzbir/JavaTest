package dataStruct;

public class LinkList {
    private Node head = null;

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insert(1);
        linkList.insert(2);
        System.out.println("链表的长度是:" + linkList.length());
        System.out.println("链表当前的元素:" + linkList);
        linkList.delete(1);
        System.out.println("删除后的链表元素:" + linkList);
    }
    private static class Node {
        Object data = null;
        Node next = null;

        private Node(Object data) {
            this.data = data;
        }

        private Node() {

        }

    }

    public LinkList() {

    }

    public void insert(Object data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

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


}



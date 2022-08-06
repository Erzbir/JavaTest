package dataStruct;

import java.util.Arrays;

public class Queue {
    private final static int expendSize = 5;
    private Object[] data;
    private int rear;
    private int head;
    private int capacity = 5;

    public Queue(int capacity) {
        if (capacity > 0) {
            this.rear = 0;
            this.head = 0;
            this.capacity = capacity;
            this.data = new Object[capacity];
        }
    }

    public Queue() {
        this.data = new Object[this.capacity];
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(2);
        System.out.println("队首元素:" + queue.peek());
        System.out.println("是否为空:" + queue.isEmpty());
        System.out.println("队的长度:" + queue.size());
        System.out.println("队的信息:" + queue);
        System.out.println("出队元素:" + queue.pop());
        System.out.println("队的信息:" + queue);
        queue.clear();
    }

    public void push(int e) {
        if (this.rear == this.head) {
            resize();
        }
        this.data[rear++] = e;
    }

    public Object pop() {
        if (this.isEmpty()) {
            throw new RuntimeException("队已为空, 不可出队");
        }
        Object result = this.data[this.head];
        this.data[this.head++] = 0;
        return result;
    }

    public Object peek() {
        if (this.isEmpty()) {
            return -Integer.MAX_VALUE;
        }
        return this.data[this.head];
    }

    public void resize() {
        int length = this.capacity + expendSize;
        this.data = Arrays.copyOf(this.data, length);
        this.capacity += expendSize;
    }

    public boolean isEmpty() {
        return this.rear == 0 || this.capacity == 0;
    }

    public void clear() {
        this.data = null;
        this.rear = 0;
        this.head = 0;
        this.capacity = 0;
    }

    public int size() {
        return this.rear - this.head;
    }

    @Override
    public boolean equals(Object objects) {
        if (objects == this) {
            return true;
        }
        Queue temp = (Queue) objects;
        if (this.size() != temp.size()) {
            return false;
        }
        return Arrays.equals(temp.data, this.data);
    }

    @Override
    public String toString() {
        return !this.isEmpty() ? "队中数据:" + Arrays.toString(Arrays.copyOfRange(this.data, head, rear)) + "  队的大小:" + this.size() : null;
    }
}
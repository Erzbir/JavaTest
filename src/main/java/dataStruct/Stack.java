package dataStruct;

import java.util.Arrays;

public class Stack {
    private final static int expendSize = 5;
    private Object[] data;
    private int top;
    private int capacity = 5;

    public Stack(int capacity) {
        if (capacity > 0) {
            this.top = 0;
            this.capacity = capacity;
            this.data = new Object[capacity];
        }
    }

    public Stack() {
        this.data = new Object[this.capacity];
    }

    public static void main(String[] args) {
        Stack stack_1 = new Stack(5);
        stack_1.push(1);
        stack_1.push(2);
        stack_1.push(3);
        stack_1.push(4);
        stack_1.push(5);
        stack_1.push(2);
        System.out.println("栈顶元素:" + stack_1.peek());
        System.out.println("是否为空:" + stack_1.isEmpty());
        System.out.println("栈的大小:" + stack_1.size());
        System.out.println("栈的信息:" + stack_1);
        System.out.println("出栈元素:" + stack_1.pop());
        stack_1.clear();
    }

    public void push(int e) {
        if (this.top == this.capacity - 1) {
            resize();
        }
        this.data[top++] = e;
    }

    public Object pop() {
        if (this.isEmpty()) {
            throw new RuntimeException("栈已为空, 不可出栈");
        }
        Object result = this.data[this.top - 1];
        this.data[--this.top] = 0;
        return result;
    }

    public Object peek() {
        if (this.isEmpty()) {
            return -Integer.MAX_VALUE;
        }
        return this.data[this.top - 1];
    }

    public void resize() {
        int length = this.capacity + expendSize;
        this.data = Arrays.copyOf(this.data, length);
        this.capacity += expendSize;
    }

    public boolean isEmpty() {
        return this.top == 0 || this.capacity == 0;
    }

    public void clear() {
        this.data = null;
        this.top = 0;
        this.capacity = 0;
    }

    public int size() {
        return this.top;
    }

    @Override
    public boolean equals(Object objects) {
        if (objects == this) {
            return true;
        }
        Stack temp = (Stack) objects;
        if (this.size() != temp.size()) {
            return false;
        }
        return Arrays.equals(temp.data, this.data);
    }

    @Override
    public String toString() {
        return !this.isEmpty() ? "栈中数据:" + Arrays.toString(Arrays.copyOf(this.data, top)) + "  栈的大小:" + this.size() : null;
    }
}
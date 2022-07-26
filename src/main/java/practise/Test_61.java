package practise;

import java.util.Arrays;

public class Test_61 {
    public static void main(String[] args) {
        Stack stack_1 = new Stack(0);
        stack_1.push(1);
        stack_1.push(2);
        System.out.println("栈顶元素:" + stack_1.peek());
        System.out.println("是否为空:" + stack_1.isEmpty());
        System.out.println("栈的大小:" + stack_1.size());
        System.out.println("栈的信息:" + stack_1);
        System.out.println("出栈元素:" + stack_1.pop());
        stack_1.clear();
    }
}

class Stack {
    public int[] data;
    public int top;
    public int capacity;

    public Stack(int capacity) {
        if (capacity != 0) {
            this.top = 0;
            this.capacity = capacity;
            this.data = new int[capacity];
        }
    }

    public Stack() {

    }

    public static void main(String[] args) {
        Stack stack_1 = new Stack(5);
        stack_1.push(1);
        stack_1.push(2);
        System.out.println("栈顶元素:" + stack_1.peek());
        System.out.println("是否为空:" + stack_1.isEmpty());
        System.out.println("栈的大小:" + stack_1.size());
        System.out.println("栈的信息:" + stack_1);
        System.out.println("出栈元素:" + stack_1.pop());
        stack_1.clear();
    }

    public void push(int e) {
        try {
            if (this.top == this.capacity - 1) {
                System.out.println("栈已满");
                return;
            }
            this.data[this.top++] = e;
        } catch (NullPointerException ignored) {
        }
    }

    public int pop() {
        if (this.isEmpty()) {
            return -Integer.MAX_VALUE;
        }
        int result = this.data[this.top - 1];
        this.data[this.top--] = 0;
        return result;
    }

    public int peek() {
        if (this.isEmpty()) {
            return -Integer.MAX_VALUE;
        }
        return this.data[this.top - 1];
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
        return this.capacity;
    }

    @Override
    public String toString() {
        return !this.isEmpty() ? "栈中数据:" + Arrays.toString(Arrays.copyOf(this.data, top)) + "  栈的大小:" + this.size() : null;
    }
}

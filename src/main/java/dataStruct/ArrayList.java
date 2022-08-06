package dataStruct;

import java.util.Arrays;

public class ArrayList {
    private final static int expendSize = 5;    // 一次扩容的容量为5
    private Object[] data;
    private int size;   // 记录长度
    private int capacity = 5;   // 默认容量为5

    public ArrayList() {
        this.data = new Object[this.capacity];
    }

    public ArrayList(int capacity) {
        if (capacity < 0) {
            throw new RuntimeException("容量不能为负数");
        }
        this.capacity = capacity;
        this.data = new Object[capacity];
    }

    public ArrayList(Object[] arr) {
        this.data = arr;
        this.size = arr.length;
        this.capacity = arr.length + 1;
    }

    public void append(Object e) {
        if (this.size == this.capacity) {
            reSize();
        }
        this.data[this.size++] = e;
    }

    public void add(Object[] array) {
        for (int i = this.size, j = 0; i < array.length; i++, j++) {
            if (this.size == this.capacity) {
                reSize();
            }
            this.data[i] = array[j];
        }
    }

    public void reSize() {
        int length = this.capacity + expendSize;
        this.data = Arrays.copyOf(this.data, length);
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        this.data = null;
        this.size = 0;
        this.capacity = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.data);
    }
}

package lesson5;

public class DArray {

    private int[] data;
    private int size;
    private int capacity;

    public DArray() {
        capacity = 100;
        size = 0;
        data = new int[capacity];
    }

    public void add(int value) {
        data[size] = value;
        size++;
    }

    public void add(int idx, int value) {
        // 1 2 3 4 5
        //       3 3 3
        // 1 2 3 4 5 -> 1
        //       3 4 5
        for (int i = size; i > idx; i--) {
            data[i] = data[i - 1];
        }
        data[idx] = value;
        size++;
    }

    public void remove(int idx) {
        //     |
        // 1 2 3 4 5
        //     4 5 | 5
        for (int i = idx; i < size; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}

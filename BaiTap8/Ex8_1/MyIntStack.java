package BaiTap8.Ex8_1;

public class MyIntStack {
    private int[] contents;
    private int tos;
    public MyIntStack(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full! Cannot push " + element);
            return;
        }
        contents[++tos] = element;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1; 
        }
        return contents[tos--];
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to peek.");
            return -1;
        }
        return contents[tos];
    }
    public boolean isEmpty() {
        return tos < 0;
    }
    public boolean isFull() {
        return tos == contents.length - 1;
    }
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= tos; i++) {
            System.out.print(contents[i] + " ");
        }
        System.out.println();
    }

   
}


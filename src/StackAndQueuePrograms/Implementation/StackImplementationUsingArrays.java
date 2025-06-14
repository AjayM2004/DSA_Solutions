package StackAndQueuePrograms.Implementation;

import java.util.Scanner;
class StackArr {
    int size;
    int[] arr;
    int top = -1;

    StackArr(int size) {
        this.size = size;
        arr = new int[size];
    }

    void push(int data) {
        if (top + 1 == size) {
            System.out.println("Stack already full...");
            return;
        }
        arr[++top] = data;
        System.out.println(data + " pushed successfully into the stack.....");
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty....");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty...");
            return -1;
        }
        return arr[top];
    }

    int length() {
        return top + 1;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty...");
            return;
        }
        System.out.println("--------------");
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("--------------");
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class StackImplementationUsingArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the stack...");
        int n = scan.nextInt();
        StackArr stack = new StackArr(n);

        for (int i = 1; i <= 100; i += 5) {
            stack.push(i);
        }

        stack.display();

        int topElement = stack.peek();
        if (topElement != -1)
            System.out.println("Element at the top is " + topElement);

        int popped = stack.pop();
        if (popped != -1)
            System.out.println("Popped Element is " + popped);

        topElement = stack.peek();
        if (topElement != -1)
            System.out.println("Element at the top is " + topElement);
    }
}

package StackAndQueuePrograms.Implementation;

import java.util.Scanner;
class QueueArr{
    int[] arr;
    int currentLength=0;
    int size;
    int front = -1;
    int rear = -1;
    QueueArr(int size){

       arr  = new int[size];
       this.size = size;
    }
    void push(int data)
    {
        if(isFull())
        {
            System.out.println("OverFlow");
            return;
        }
        if(isEmpty())
        {
           front = 0;
           rear = 0;
        }
        else
        {
            rear = (rear+1)%size;
        }
        arr[rear] = data;
        currentLength++;
    }
    int pop()
    {
        if(isEmpty())
        {
            System.out.println("UnderFlow");
            return -1;
        }
        int element = arr[front];
        front = (front+1)%size;
        currentLength--;
        return element;
    }
    int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty...");
            return -1;
        }
        else
        {
            return arr[front];
        }
    }
    boolean isFull()
    {
        return currentLength==size;
    }
    boolean isEmpty()
    {
       return currentLength==0;
    }
    int length()
    {
        return size;
    }
    void display()
    {
        if(isEmpty())
        {
            System.out.println("queue is Empty");
            return;
        }
        int index = front;
        System.out.println("elements present in the queue right now...");
        for(int i=0;i<currentLength;i++)
        {
            System.out.print(arr[index]+" ");
            index = (index+1)%size;
        }
        System.out.println();
    }
    void clear() {
        front = -1;
        rear = -1;
        currentLength = 0;
        System.out.println("Queue has been cleared.");
    }

}
public class QueueImplementationUsingArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size->");
        int n = scan.nextInt();
        QueueArr queue = new QueueArr(n);
        for(int i=10;i<=20;i++)
        {
            queue.push(i);
        }
        queue.display();
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        queue.display();
        queue.clear();
    }
}
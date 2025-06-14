package StackAndQueuePrograms.Implementation;
class Node {
    int data;
    Node next;
    Node(int data,Node next)
    {
        this.next = next;
        this.data = data;
    }
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class StackLL{
    private Node top;
    int size;
    StackLL()
    {
        this.top = null;
        this.size = 0;
    }
    void push(int data)
    {
        Node node = new Node(data);
        node.next = top;
        top = node;
        size++;
        System.out.println(data+" is inserted at the top of the list.....");
    }
    int pop()
    {
        if(top==null)
        {
            System.out.println("Stack Underflow (stack is Empty)");
            return -1;
        }
        Node element = top;
        top = top.next;
        element.next = null;
        size--;
        System.out.println(element.data+ " is popped successfully..");
        return element.data;
    }
    int length()
    {
        return size;
    }
    boolean isEmpty()
    {
        return size==0;
    }
    void display()
    {
        Node temp = top;
        System.out.println("-------");
        while(temp!=null)
        {
            System.out.println(temp.data);
            System.out.println("-------");
            temp = temp.next;
        }
        System.out.println("--------");
    }
    int peek()
    {
        if(top==null)
        {
            return -1;
        }
        return top.data;
    }
}
public class StackImplementationUsingLinkedList{
    public static void main(String[] args) {
        StackLL stack = new StackLL();
        for(int i=11;i<=20;i++)
        {
            stack.push(i);
        }
        stack.display();
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.length());
    }
}
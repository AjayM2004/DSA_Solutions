package StackAndQueuePrograms.Implementation;
class QueueLL{
     Node front,rear;
     int size=0;
     QueueLL()
     {
         this.front = null;
         this.rear = null;
         this.size = 0;
     }
     void push(int data)
     {
         Node node = new Node(data);
         if(front==null)
         {
             front = node;
             rear = node;
             size++;
         }
         else
         {
             rear.next = node;
             rear = rear.next;
             size++;
         }
         System.out.println(data+" inserted successfully..");
     }
     int pop()
     {
         if(front==null)
         {
             System.out.println("Queue underflow...");
             return -1;
         }
         else
         {
             Node element = front;
             front = front.next;
             element.next = null;
             System.out.println(element.data+" deleted successfully..");
             size--;
             return element.data;
         }
     }
     int peek()
     {
         if(front==null)
         {
             System.out.println("Queue is Empty..");
             return -1;
         }
         else
         {
             return front.data;
         }
     }
     void display()
     {
         Node temp = front;
         while(temp!=null) {
             System.out.print(temp.data + "->");
             temp = temp.next;
         }
         System.out.println();
     }
     int length()
     {
         return size;
     }
     boolean isEmpty()
     {
         return size==0;
     }

}
public class QueueImplementationUsingLinkedList {
    public static void main(String[] args) {
        QueueLL queue = new QueueLL();
        for(int i=11;i<=20;i++)
        {
            queue.push(i);
        }
        queue.display();
        System.out.println(queue.pop());
        System.out.println(queue.peek());
    }
}
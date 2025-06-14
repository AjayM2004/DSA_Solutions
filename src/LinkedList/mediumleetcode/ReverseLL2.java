package LinkedList.mediumleetcode;
class ListNode{
    int data;
    ListNode next;
    ListNode(int data,ListNode next)
    {
        this.next = next;
        this.data = data;
    }
    ListNode(int data)
    {
        this.next = null;
        this.data = data;
    }

}
public class ReverseLL2 {
    static ListNode reverse(ListNode head)
    {
        ListNode temp = head;
        ListNode prev = null;
        ListNode front = null;
        while(temp!=null)
        {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    static ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)
        {
            return head;
        }
        ListNode temp = head;
        for(int i=left;i<right;i++)
        {
            temp = temp.next;
        }
        ListNode nextNode = temp.next;
        temp.next = null;
        ListNode newTail = reverse(head);
        newTail.next = nextNode;
        return head;
    }
    public static void main(String[] args) {
         
    }
}

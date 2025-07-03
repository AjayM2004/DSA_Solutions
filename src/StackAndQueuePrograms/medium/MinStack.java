package StackAndQueuePrograms.medium;
import java.util.*;
class Pair{
    int first;
    int second;
    Pair(int first,int second)
    {
        this.first = first;
        this.second = second;
    }
}
public class MinStack {
    Stack<Pair> stack;
    public MinStack() {
        stack = new Stack<>();
    }
    public void push(int val) {
        if(stack.isEmpty())
        {
            stack.push(new Pair(val,val));
        }
        else
        {
            int currentMinimum = stack.peek().second;
            stack.push(new Pair(val,Math.min(currentMinimum,val)));
        }
    }

    public void pop() {
        if(!stack.isEmpty())
        {
            stack.pop();
        }
    }

    public int top() {
        if(stack.isEmpty())
        {
            return -1;
        }
        else
        {
            return stack.peek().first;
        }
    }

    public int getMin() {
        if(stack.isEmpty())
        {
            return -1;
        }
        else
        {
            return stack.peek().second;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

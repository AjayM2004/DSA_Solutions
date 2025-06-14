package StackAndQueuePrograms.medium;

import java.util.*;

public class ValidParanthesis{
        public static boolean isValidParenthesis(String s) {
            int n = s.length();
            HashMap<Character,Character> map = new HashMap<>();
            map.put('}','{');
            map.put(')','(');
            map.put(']','[');
            Stack<Character> stack = new Stack<>();
            for(int i=0;i<n;i++)
            {
                char c = s.charAt(i);
                if(!map.containsKey(c))
                {
                    stack.push(c);
                }
                else{
                    if(stack.isEmpty())
                    {
                        return false;
                    }
                    char top = stack.pop();
                    if(top!=map.get(c))
                    {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Valid Paranthesis->"+isValidParenthesis("{{}[]}"));
        System.out.println("Valid Paranthesis->"+isValidParenthesis("{{}[]})"));
    }

}

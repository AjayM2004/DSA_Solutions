package StackAndQueuePrograms.Implementation;
import java.util.*;
public class InfixToPostfix {

    static int priority(char c) {
        if (c == '^') return 3;
        else if (c == '*' || c == '/') return 2;
        else return 1;
    }

    static String infixToPostfix(String str) {
        int n = str.length();
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }

                stack.pop();

            } else { // Operator
                while (!stack.isEmpty() &&
                        ((priority(ch) < priority(stack.peek())) ||
                                (priority(ch) == priority(stack.peek()) && ch != '^')) &&
                        stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        while (t-- > 0) {
            String str = scan.nextLine();
            System.out.println(infixToPostfix(str));
        }
    }
}
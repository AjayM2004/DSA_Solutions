package recursion.basics;

import java.util.Scanner;

public class Fact {
    static int fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n * fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ans = fact(n);
        System.out.println("factorial of the given no is->"+ans);
    }
}

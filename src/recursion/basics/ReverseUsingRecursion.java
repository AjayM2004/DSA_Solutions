package recursion.basics;

public class ReverseUsingRecursion {
    static int rev(int n)
    {
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    static int helper(int n,int digits)
    {
        if(n%10==n)
        {
            return n;
        }
        int rem = n%10;
        return rem*(int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }
    public static void main(String[] args) {
        int res = rev(1221);
        if(res==1221)
        {
            System.out.println("palindrome..");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
}

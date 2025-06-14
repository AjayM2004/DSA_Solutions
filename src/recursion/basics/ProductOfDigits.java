package recursion.basics;

public class ProductOfDigits {
    static int prod(int n)
    {
        if(n%10==n)
        {
            return n;
        }
        return prod(n/10) * (n%10);
    }
    public static void main(String[] args) {
        System.out.println(prod(1342));
    }
}

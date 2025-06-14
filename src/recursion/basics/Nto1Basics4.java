package recursion.basics;

public class Nto1Basics4 {
    public static void main(String[] args) {
        funRev(5);
    }
    static void funRev(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        funRev(n-1);
    }
}

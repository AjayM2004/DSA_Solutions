package recursion.basics;

public class OneToNBasics5 {
    public static void main(String[] args) {
        func(5);
    }
    static void func(int n)
    {
        if(n==0)
        {
            return;
        }
        func(n-1);
        System.out.println(n);
    }
}

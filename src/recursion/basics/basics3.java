package recursion.basics;

public class basics3 {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n)
    {
        if(n==5)
        {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        print(n+1);
    }
}

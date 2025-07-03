package recursion.basics;

public class SkipACharacter{
    static void skipACharacter(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        if(up.charAt(0)=='a')
        {
            up = up.substring(1);
            skipACharacter(p,up);
        }
        else
        {
            p = p + up.charAt(0);
            up = up.substring(1);
            skipACharacter(p,up);
        }
    }
    public static void main(String[] args) {
        skipACharacter("","ajay");
    }
}

package recursion.basics;

public class skipACharacter2 {
    static String skipACharacter2(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }
        if(up.startsWith("a"))
        {
            return skipACharacter2(up.substring(1));
        }
        else
        {
            return up.charAt(0)+skipACharacter2(up.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println(skipACharacter2("ajay"));
    }
}

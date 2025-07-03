package recursion.basics;

public class SkipAString {
    static String skipAString(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }
        if(up.startsWith("apple"))
        {
            return skipAString(up.substring(5));
        }
        else
        {
            return up.charAt(0)+skipAString(up.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println(skipAString("aappleajay"));
    }
}

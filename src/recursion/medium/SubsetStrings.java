package recursion.medium;

import java.util.ArrayList;

public class SubsetStrings {
    static ArrayList<String> subsetGenerator3(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsetGenerator3(p+ch,up.substring(1));
        ArrayList<String> right = subsetGenerator3(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    static void subsetGenerator1(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsetGenerator1(p+ch,up.substring(1));
        subsetGenerator1(p,up.substring(1));
    }
    static void subsetGenerator2(String p, String up, ArrayList<String> list)
    {
        if(up.isEmpty())
        {
            list.add(p);
            return;
        }
        char ch = up.charAt(0);
        subsetGenerator2(p+ch,up.substring(1),list);
        subsetGenerator2(p,up.substring(1),list);
    }
    public static void main(String[] args) {
       subsetGenerator1("","abc");
       ArrayList<String> list = new ArrayList<>();
        System.out.println( subsetGenerator3("","abc"));
    }
}

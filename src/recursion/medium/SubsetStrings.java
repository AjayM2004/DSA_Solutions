package recursion.medium;

import java.util.ArrayList;

public class SubsetStrings {
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
       subsetGenerator2("","abc",list);
        System.out.println(list);
    }
}

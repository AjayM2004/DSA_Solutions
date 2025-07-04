package recursion.medium;

import java.util.*;

public class PermutationsOfString {
    static void permutations(String p, String up, ArrayList<String> list)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            list.add(p);
            return;
        }
        int n = p.length();
        for(int i=0;i<=n;i++)
        {
            char ch = up.charAt(0);
            String f = p.substring(0,i);
            String s = p.substring(i,n);
            permutations(f+ch+s,up.substring(1),list);
        }
    }
    static List<String> permutationsList(String p, String up)
    {
        if(up.isEmpty())
        {
            List<String> temp = new ArrayList<>();
            temp.add(p);
            return temp;
        }
        int n = p.length();
        List<String> ans = new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            char ch = up.charAt(0);
            String f = p.substring(0,i);
            String s = p.substring(i,n);
            ans.addAll(permutationsList(f+ch+s,up.substring(1)));
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        permutations("","ABC",list);
        List<String> list1 = permutationsList("","ABC");
        System.out.println(list1);
    }
}

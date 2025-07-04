package recursion.medium;
import java.util.*;
public class PrintSubsequenceIterative {
    static List<List<Integer>> printSubsequence(int[] nums)
    {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:nums)
        {
            int n = outer.size();
            for(int i=0;i<n;i++)
            {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    public static void main(String[] args) {
           System.out.println(printSubsequence(new int[]{1,2,3}));
    }
}

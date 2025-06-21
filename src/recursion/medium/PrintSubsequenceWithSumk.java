package recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequenceWithSumk {
    static boolean printSubsequenceWithSumK(int index, int[] arr, List<Integer> list, int sum, int s)
    {
        if(index>=arr.length)
        {
            if(s==sum)
            {
                System.out.println(list);
                return true;
            }
            return false;
        }
        list.add(arr[index]);
        s = s + arr[index];
        if(printSubsequenceWithSumK(index+1,arr,list,sum,s))
        {
            return true;
        }
        list.removeLast();
        s = s - arr[index];
        if(printSubsequenceWithSumK(index+1,arr,list,sum,s))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] arr = {1,2,1};
        System.out.println(printSubsequenceWithSumK(0,arr,list,2,0));
    }
}

package recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequencesWithSumK {
    static void printSubsequences(int index, int[] arr, List<Integer> list, int sum,int s)
    {
        if(index>=arr.length)
        {
            if(s==sum)
            {
                System.out.println(list);
            }
            return;
        }
        list.add(arr[index]);
        s+=arr[index];
        printSubsequences(index+1,arr,list,sum,s);
        list.remove(list.size()-1);
        s-=arr[index];
        printSubsequences(index+1,arr,list,sum,s);
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3};
        List<Integer> list = new ArrayList<>();
        printSubsequences(0,arr,list,3,0);
    }
}

package recursion.basics;

import java.util.ArrayList;

public class LinearSearch {
    static int findLastIndex(int[] arr,int target,int index)
    {
        if(index==-1)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
       return findLastIndex(arr,target,index-1);
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list)
    {
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
    public static void main(String[] args) {
        int[] arr = {11,12,12,12,14};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Ans for all index->"+findAllIndex(arr,12,0,list));
        System.out.println("Ans for Last index match->"+findLastIndex(arr,12,arr.length-1));
    }
}

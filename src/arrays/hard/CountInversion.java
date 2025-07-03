package arrays.hard;
// User function Template for Java

import java.util.ArrayList;

public class CountInversion {
    static int counter(int[] arr,int low,int mid,int high)
    {
        int right = mid+1;
        int cnt = 0;
        for(int i=low;i<=mid;i++)
        {
            while(right<=high && arr[i]>(arr[right]*2))
            {
                right++;
            }
            cnt = cnt + (right-(mid+1));
        }
        return cnt;
    }
    static void merge(int[] arr,int low,int mid,int high)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                list.add(arr[left++]);
            }
            else
            {
                list.add(arr[right++]);
            }
        }
        while(left<=mid)
        {
            list.add(arr[left++]);
        }
        while(right<=high)
        {
            list.add(arr[right++]);
        }
        for(int i=low;i<=high;i++)
        {
            arr[i] = list.get(i-low);
        }
    }
    static int mergeSort(int[] arr,int low,int high)
    {
        int cnt = 0;
        if(low>=high)
        {
            return cnt;
        }
        int mid = low+(high-low)/2;
        cnt+=mergeSort(arr,low,mid);
        cnt+=mergeSort(arr,mid+1,high);
        cnt+=counter(arr,low,mid,high);
        merge(arr,low,mid,high);
        return cnt;
    }
    static int countRevPairs(int N, int arr[]) {
        int low = 0;
        int high = arr.length-1;
        int cnt = mergeSort(arr,low,high);
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 1};
        System.out.println(countRevPairs(5,arr));
    }
}
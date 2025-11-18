package com.twopointersslidingwindow;

public class CountSubarrays {
    static int countSubArrays(int[] arr,int target)
    {
        int n = arr.length;
        int r = 0;
        int l = 0;
        int cnt = 0;
        int sum = 0;
        while(r<n)
        {
            sum = sum + arr[r];
            while(sum>target)
            {
                sum = sum - arr[l];
                l++;
            }
            cnt = cnt + (r-l+1);
            r++;
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] arr, int target) {
        return countSubArrays(arr,target) - countSubArrays(arr,target-1);
    }
}

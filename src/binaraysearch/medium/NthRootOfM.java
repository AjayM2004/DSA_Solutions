package binaraysearch.medium;// User function Template for Java

class Solution {
    static long power(int i,int n)
    {
        long ans = 1;
        while(n>0)
        {
            if(n%2==1)
            {
                ans = ans * i;
                n = n-1;
            }
            else
            {
                i = i * i;
                n = n/2;
            }
        }
        return ans;
    }
    public int nthRoot(int n, int m) {
        int left = 1;
        int right = m;
        int ans = -1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            long value = power(mid,n);
            if(value==m)
            {
                ans = mid;
                break;
            }
            else if(value>m)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        return ans;
    }
}
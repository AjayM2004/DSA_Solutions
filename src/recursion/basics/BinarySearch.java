package recursion.basics;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,60,70,90};
        int s = 0;
        int e = arr.length-1;
        int ans = search(arr,s,e,90);
        System.out.println(ans);
    }
    static int search(int[] arr,int s,int e,int target)
    {
         if(s>e)
         {
             return -1;
         }
         int mid = s + (e-s)/2;
         if(arr[mid]==target)
         {
             return mid;
         }
         if(arr[s]>target)
         {
             return search(arr,s,mid-1,target);
         }
         return search(arr,mid+1,e,target);
    }
}

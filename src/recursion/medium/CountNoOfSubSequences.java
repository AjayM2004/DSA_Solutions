package recursion.medium;

public class CountNoOfSubSequences {
    static int countNoOfSubseqeunces(int[] arr,int index,int s,int sum)
    {
        if(index>=arr.length)
        {
            if(s==sum)
            {
                return 1;
            }
            return 0;
        }
        s+=arr[index];
        int left = countNoOfSubseqeunces(arr,index+1,s,sum);
        s-=arr[index];
        int right = countNoOfSubseqeunces(arr,index+1,s,sum);
        return left+right;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(countNoOfSubseqeunces(arr,0,0,3));
    }
}

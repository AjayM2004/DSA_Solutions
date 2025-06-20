package recursion.medium;
import java.util.*;
public class poweSetUsingRecursion {
    static void generateSubset(int index,int[] nums,List<Integer> list,List<List<Integer>> ans)
    {
        if(index>=nums.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        generateSubset(index+1,nums,list,ans);
        list.remove(list.size()-1);
        generateSubset(index+1,nums,list,ans);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        generateSubset(0,nums,list,ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subsets(arr));
    }
}

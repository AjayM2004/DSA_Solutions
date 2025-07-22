package recursion.medium;
import java.util.*;
public class SubsetsWithoutDup {

        static void generateSubsets(int index,int[] nums,List<Integer> temp,List<List<Integer>> ansList)
        {
            ansList.add(new ArrayList<>(temp));
            for(int i=index;i<nums.length;i++)
            {
                if(i!=index && nums[i]==nums[i-1])
                {
                    continue;
                }
                temp.add(nums[i]);
                generateSubsets(index+1,nums,temp,ansList);
                temp.removeLast();
            }
        }
        public static List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> ansList = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();
            generateSubsets(0,nums,temp,ansList);
            return ansList;

    }
    public static void main(String[] args) {
        System.out.println(subsetsWithDup(new int[]{1,2,2}));
    }
}

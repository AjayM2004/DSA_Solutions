package tree.bt.basics;
import java.util.*;
public class Q2IsBalanced {
    static int maxDepth(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh = maxDepth(root.left);
        if(lh==-1)
        {
            return -1;
        }
        int rh = maxDepth(root.right);
        if(rh==-1)
        {
            return -1;
        }
        if(Math.abs(lh-rh)>1)
        {
            return -1;
        }
        return 1+Math.max(lh,rh);
    }
    static boolean isBalanced(TreeNode root)
    {
        return root == null || maxDepth(root) != -1;
    }
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(3,9,20,null,null,15,7));
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(1,2,2,3,3,null,null,4,4));
        TreeNode root1 = Tree.buildTree(arr1);
        TreeNode root2 = Tree.buildTree(arr2);
        System.out.println("isBalanced tree -> "+isBalanced(root1));
        System.out.println("isBalanced tree -> "+isBalanced(root2));
    }
}

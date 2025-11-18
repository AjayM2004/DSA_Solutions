package tree.bt.basics;

import java.util.*;

public class Q1MaxDepth {
    static int maxDepth(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        return 1 + Math.max(lh,rh);
    }
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(3,9,20,null,null,15,7));
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(1,null,2));
        TreeNode root1 = Tree.buildTree(arr1);
        TreeNode root2 = Tree.buildTree(arr2);
        System.out.println("Max depth of tree 1 = "+maxDepth(root1));
        System.out.println("Max Depth of tree 2 = "+maxDepth(root2));
    }
}

package tree.bt.basics;

import java.util.LinkedList;
import java.util.*;

public class Tree {
    static TreeNode buildTree(List<Integer> arr)
    {
        if(arr.isEmpty() || arr.getFirst()==null)
        {
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(arr.getFirst());
        q.offer(root);
        int i = 1;
        while(!q.isEmpty() && i<arr.size())
        {
            TreeNode curr = q.poll();
            if(i<arr.size() && arr.get(i)!=null)
            {
                curr.left = new TreeNode(arr.get(i));
                q.offer(curr.left);
            }
            i++;
            if(i<arr.size() && arr.get(i)!=null)
            {
                curr.right = new TreeNode(arr.get(i));
                q.offer(curr.right);
            }
            i++;
        }
        return root;
    }
}

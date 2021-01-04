package Tree.LeetCode;

import Tree.Tree;
import Tree.TreeNode;

public class SumOfLeftLeaves {
    TreeNode root;
    int totalsum;
    public SumOfLeftLeaves(TreeNode root)
    {
        this.root=root;
        totalsum=0;
        helper(root);
        System.out.println(totalsum);
    }
    public void helper(TreeNode root)
    {
        if(root.left==null && root.right==null)
        {
            totalsum+=root.val;
        }
        if(root.left!=null)
        {
            helper(root.left);
        }
        if(root.right!=null)
        {
        if(root.right.left!=null || root.right.right!=null)
        {
                helper(root.right);
            }
        }

    }
}

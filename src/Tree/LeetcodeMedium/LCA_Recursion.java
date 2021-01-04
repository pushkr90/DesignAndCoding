package Tree.LeetcodeMedium;

import Tree.TreeNode;

public class LCA_Recursion
{
    public TreeNode helper(TreeNode root,TreeNode p,TreeNode q)
    {
        if(root==null)
        {
            return null;
        }
        if(root.val==p.val ||root.val==q.val)
        {
            return root;
        }
        TreeNode left=helper(root.left,p,q);
        TreeNode right=helper(root.right,p,q);
        if(left!=null && right!=null)
        {
            return root;
        }
        if(left==null && right==null)
        {
            return null;
        }
        return left!=null?left:right;
    }

}

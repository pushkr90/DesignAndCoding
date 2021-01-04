package Tree.LeetcodeMedium;

import Tree.TreeNode;

public class LongestUnivaluePath {
    TreeNode root;
    int max;
    public LongestUnivaluePath(TreeNode root)
    {
        this.root=root;
        max=0;
        helper(root,root.val);

    }
    public int helper(TreeNode node,int val)
    {
        if(root==null)
        {
            return 0;
        }
        int left=helper(node.left,node.val);
        int right=helper(node.right,node.val);
        max=Math.max(max,left+right);
        if(node.val==val)
        {
            return Math.max(left,right)+1;
        }
        return 0;
    }
}

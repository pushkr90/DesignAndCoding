package Tree.LeetCode;

import Tree.TreeNode;

public class SameTree {
    TreeNode p;
    TreeNode q;
    boolean found;
    public SameTree(TreeNode p,TreeNode q)
    {
        this.p=p;
        this.q=q;
        found=true;
        System.out.println(helper(p,q));
    }
    public boolean helper(TreeNode p,TreeNode q)
    {
        if(p==null && q==null)
        {
            return true;
        }
        if(p==null ||q==null)
        {
            return false;
        }
        else if(p.val==q.val)
        {
            boolean left=helper(p.left,q.left);
            boolean right=helper(p.right,q.right);
            if(left && right)
            {
                return true;
            }
        }
        return false;
    }
}

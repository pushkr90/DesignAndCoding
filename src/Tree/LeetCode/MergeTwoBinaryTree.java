package Tree.LeetCode;

import Tree.TreeNode;

public class MergeTwoBinaryTree
{

    TreeNode t1;
    TreeNode t2;
    public MergeTwoBinaryTree(TreeNode t1,TreeNode t2)
    {
        this.t1=t1;
        this.t2=t2;
        //merge(t1,t2);
    }
    public TreeNode merge(TreeNode t1,TreeNode t2)
    {
        if(t1==null)
        {
            return t2 ;
        }
        if(t2==null)
        {
            return t1;
        }
        t1.val+=t2.val;
        t1.left=merge(t1.left,t2.left);
        t1.right=merge(t1.right,t2.right);
        return t1;
    }
}

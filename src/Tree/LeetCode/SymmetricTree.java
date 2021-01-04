package Tree.LeetCode;

import Tree.TreeNode;

public class SymmetricTree {
    boolean sym;
    TreeNode root;
    public SymmetricTree(TreeNode root)
    {
        this.root=root;
        TreeNode left=root.left;
        TreeNode right=root.right;
       System.out.println(check(left,right));
    }

    public boolean check(TreeNode n1, TreeNode n2)
    {
        if(n1==null && n2==null)
        {
            return true;
        }
        if(n1==null ||n2==null)
        {
            return false;
        }
        else{
            return n1.val==n2.val && check(n1.left,n2.right) && check(n1.right,n2.left);
        }

    }
}

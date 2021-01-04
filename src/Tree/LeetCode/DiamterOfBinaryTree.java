package Tree.LeetCode;

import Tree.TreeNode;

public class DiamterOfBinaryTree
{
    TreeNode root;
    int diameter=0;
    public DiamterOfBinaryTree(TreeNode root)
    {
        this.root=root;
        calculate(root);
        System.out.print("the diamter is"+diameter);

    }

    private int calculate(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftVal = calculate(root.left);
        int rightVal = calculate(root.right);
        diameter=Math.max(leftVal+rightVal,diameter);
        return Math.max(leftVal,rightVal)+1;
    }

}

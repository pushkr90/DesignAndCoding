package Tree;

public class TreeNode
{
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int value,TreeNode left,TreeNode right)
    {
        this.val=value;
        this.left=left;
        this.right=right;
    }
    public TreeNode(int value)
    {
        this.val=value;
        left=null;
        right=null;
    }
}

package Tree;

public class DfsTraversal
{


    protected void preOrder(TreeNode root)
    {
        if(root!=null) {
           System.out.print(root.val+" ");
           preOrder(root.left);
           preOrder(root.right);

        }
    }
    protected void inOrder(TreeNode root)
    {
        if(root!=null)
        {
            inOrder(root.left);
            System.out.print(root.val+" ");
            inOrder(root.right);

        }
    }
    protected void postOrder(TreeNode root)
    {
        if(root!=null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val+" ");

        }
    }


}

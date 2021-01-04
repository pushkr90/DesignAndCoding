package Tree;

public class TreeBuilder
{
    Integer[] arr;
    TreeNode root;
    public TreeBuilder(Integer[] arr)
    {
        this.arr=arr;
        TreeNode N=build(root,0);


    }
    protected TreeNode build(TreeNode root, int index)
    {
        if(index< arr.length)
        {
            if(arr[index]!=null)
            {
                //int NodeVal=Integer.parseInt(arr[index]);
                TreeNode temp=new TreeNode(arr[index]);
                root=temp;
                root.left=build(root.left,2*index+1);
                root.right=build(root.right,2*index+2);
            }
        }
        return root;
    }

}

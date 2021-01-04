package Tree;

public class Convert {

    int[] pre;
    int[] in;
    TreeNode res;
    int preStart=0;
    public Convert(int[] in,int[] pre)
    {
        this.pre=pre;
        this.in=in;
        int preEnd=pre.length;
        int inEnd=in.length;
        this.res=contruct(pre,in,0,preEnd,inEnd);
    }
    protected TreeNode contruct(int[] pre,int[]in,int inStart,int preEnd,int inEnd )
    {
        int index=0;
        if(inStart==inEnd || preStart>pre.length)
        {
            return null;
        }

        int root=pre[preStart++];

        TreeNode curr=new TreeNode(root);
        for(int i=0;i<in.length;i++)
        {
            if(root!=in[i])
            {
                index++;
            }
            else
                break;
        }

        curr.left=contruct(pre,in,inStart,preEnd,index);
        curr.right=contruct(pre,in,index+1,preEnd,inEnd);

    return curr;
    }


}

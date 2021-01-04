package Tree.LeetCode;

import Tree.TreeNode;

import java.util.HashMap;

public class InOrderPostOrder {
    int[] inOrder;
    int[] postOrder;
    int PostIndex;
    public TreeNode res;
    HashMap<Integer,Integer> map=new HashMap<>();


    public InOrderPostOrder(int[] inOrder,int[] postOrder)
    {
        this.inOrder=inOrder;
        this.postOrder=postOrder;
        int inLength=inOrder.length;
       int counter=0;
        for(int each:postOrder)
        {
            map.put(each,counter++);
        }
        PostIndex=postOrder.length-1;
        res=build(0,inLength);
    }

    protected TreeNode build(int inStart,int inEnd )
    {
        if(inStart==inEnd)
        {
            return null;
        }
        int root=postOrder[PostIndex--];
        int rootIndex=0;
        rootIndex=findIndexRoot(root);
        TreeNode curr=new TreeNode(root);
        curr.right=build(rootIndex+1,inEnd);
        curr.left=build(inStart,rootIndex);
        return curr;
    }
    private int findIndexRoot(int index)
    {
        return map.get(index);
    }
}

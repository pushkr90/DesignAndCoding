package Tree.LeetCode;

import Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfTree {
    TreeNode root;
    int max;
    int maxForBFS;
    public MaximumDepthOfTree(TreeNode root)
    {
        this.root=root;
        max=0;
        maxForBFS=0;
        helper(root,1);
        System.out.println(max);
        bfs(root);
        System.out.println(maxForBFS);
    }

    public void helper(TreeNode root,int height)
    {
        if(root.left==null && root.right==null)
        {
            max=Math.max(max,height);
        }
        if(root.left!=null)
        {
            helper(root.left,height+1);

        }
        if(root.right!=null)
        {
            helper(root.right,height+1);
        }

    }
    public void bfs(TreeNode root)
    {
        Queue<bfshelper> qu=new LinkedList<>();
        bfshelper b=new bfshelper(root,1);
        qu.offer(b);
        while(!qu.isEmpty())
        {
            bfshelper curr=qu.poll();
            if(curr.node.right==null && curr.node.left==null)
            {
                maxForBFS=Math.max(maxForBFS,curr.height);
            }
            if(curr.node.left!=null)
            {
                bfshelper nodeleft=new bfshelper(curr.node.left,curr.height+1);
                qu.offer(nodeleft);
            }
            if(curr.node.right!=null)
            {
                bfshelper noderight=new bfshelper(curr.node.right,curr.height+1);
                qu.offer(noderight);
            }

        }
    }
    class bfshelper{
        int height;
        TreeNode node;
        public bfshelper(TreeNode node,int height)
        {
            this.node=node;
            this.height=height;
        }

    }

}

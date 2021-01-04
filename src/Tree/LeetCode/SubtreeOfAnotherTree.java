package Tree.LeetCode;

import Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SubtreeOfAnotherTree {
    TreeNode t;
    TreeNode s;
    public SubtreeOfAnotherTree(TreeNode t, TreeNode s)
    {
        this.t=t;
        this.s=s;
        System.out.println("with dfs"+find(t,s));
        System.out.print("with bfs"+findwithbfs(t,s));
    }
    protected boolean find(TreeNode t, TreeNode s)
    {
        if(t==null)
        {
            return false;
        }
        return helper(t,s)||find(t.left,s)|| find(t.right,s);
    }

    protected boolean helper(TreeNode t,TreeNode s)
    {
        if(t==null && s==null)
        {
            return true;
        }
        if(t==null ||s==null)
        {
            return false;
        }
        if(t.val!=s.val)
        {
            return false;
        }
        return helper(t.left,s.left) && helper(t.right,s.right);
    }

    protected boolean findwithbfs(TreeNode s,TreeNode t)
    {
        if(s==null)
        {
            return false;
        }
        Queue<TreeNode> qu=new LinkedList<TreeNode>();

        qu.offer(s);

        while(!qu.isEmpty())
        {
            int size=qu.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=qu.poll();
                if(helper(curr,t))
                {
                    return true;
                }
                if(curr.left!=null)
                {
                    qu.offer(curr.left);
                }
                if(curr.right!=null)
                {
                    qu.offer(curr.right);
                }
            }

        }
        return false;
    }
}

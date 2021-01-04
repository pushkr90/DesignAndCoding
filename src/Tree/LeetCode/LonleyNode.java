package Tree.LeetCode;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LonleyNode {
    TreeNode root;
    List<Integer> res;
    List<Integer> res1;
    public LonleyNode(TreeNode root)
    {
        this.root=root;
        res=new ArrayList<>();
        res1=new ArrayList<>();
        checkdfs(root);
        System.out.println("dfs"+res);

        checkbfs(root);
        System.out.print("bfs"+res1);

    }
    protected void checkdfs(TreeNode root)
    {
        if(root.left!=null && root.right==null)
        {
            res.add(root.left.val);

        }
        if(root.left==null && root.right!=null)
        {
            res.add(root.right.val);
        }
       /* if(root.left==null && root.right==null)
        {
            res.add(root.val);
        }*/
        if(root.left!=null) {
            checkdfs(root.left);
        }
        if(root.right!=null)
        {
            checkdfs(root.right);
        }
    }

    private void checkbfs(TreeNode root)
    {
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty())
        {
            int size = qu.size();
            for (int i = 0; i < size; i++)
            {
                TreeNode curr = qu.poll();
                if (curr.right != null && curr.left == null)
                {
                    res1.add(curr.right.val);
                }
                if (curr.left != null && curr.right == null)
                {
                    res1.add(curr.left.val);
                }
                if (curr.right != null)
                {
                    qu.offer(curr.right);
                }
                if (curr.left != null)
                {
                    qu.offer(curr.left);
                }

            }
        }
    }



}

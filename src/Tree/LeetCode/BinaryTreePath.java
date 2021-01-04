package Tree.LeetCode;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreePath {
    TreeNode root;
    List<String> res;
    List<String> res1;
    public BinaryTreePath(TreeNode root)
    {
        this.root=root;
        res=new ArrayList<>();
        res1=new ArrayList<>();

        helper(root,res,root.val+"");
        System.out.println(res);
        bfs(root,res1);
        System.out.println(res1);


    }


    public void helper(TreeNode root,List<String> res,String ans)
    {
        if(root.left==null && root.right==null)
        {
            res.add(ans);
        }

        if(root.left!=null)
        {
            helper(root.left,res,ans+"->"+root.left.val);
        }
        if(root.right!=null)
        {
            helper(root.right,res,ans+"->"+root.right.val);
        }
    }

    public void bfs(TreeNode node,List<String> res1)
    {
        bfsSupporter a=new bfsSupporter(node,node.val+"");
        Queue<bfsSupporter> qu=new LinkedList<>();
        qu.offer(a);
        while(!qu.isEmpty())
        {
            bfsSupporter curr=qu.poll();
            if(curr.node.right==null && curr.node.left==null)
            {
                res1.add(curr.s);

            }

            if(curr.node.left!=null)
            {
                qu.offer(new bfsSupporter(curr.node.left,curr.s+"->"+curr.node.left.val));
            }
            if(curr.node.right!=null)
            {
                qu.offer(new bfsSupporter(curr.node.right,curr.s+"->"+curr.node.right.val));
            }
        }


    }

     class bfsSupporter
     {
        TreeNode node;
        String s;
        public bfsSupporter(TreeNode node,String s)
        {
            this.node=node;
            this.s=s;

        }
     }


}

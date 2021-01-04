package Tree.LeetcodeMedium;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class PathSumSecondVerionIterativeDFS {

    TreeNode root;
    int sum;
    Queue<nodeHelper> qu;
    List<List> list;
    public PathSumSecondVerionIterativeDFS(TreeNode root,int sum)
    {
        this.root=root;
        this.sum=sum;
        list=new ArrayList<>();
        nodeHelper n=new nodeHelper(root,root.val+"",sum-root.val);
        qu.offer(n);
        helper();

    }
    public void helper()
    {
        while(!qu.isEmpty())
        {
            nodeHelper curr=qu.poll();
            if(curr.nodeSum==0 && curr.node.right==null && curr.node.left==null)
            {
                Scanner s=new Scanner(curr.s);
                List<Integer> temp=new ArrayList<>();
                while (s.hasNextInt())
                {
                    temp.add(s.nextInt());
                }
                list.add(temp);

            }
            if(curr.node.left!=null)
            {
                qu.offer(new nodeHelper(curr.node.left,curr.s+curr.node.left.val+" ", curr.nodeSum-curr.node.left.val));
            }
            if(curr.node.right!=null)
            {
                qu.offer(new nodeHelper(curr.node.right,curr.s+curr.node.right.val+" ", curr.nodeSum-curr.node.right.val));
            }

        }
    }

    class nodeHelper{
        TreeNode node;
        String s;
        int nodeSum;
        public nodeHelper(TreeNode node,String s,int nodeSum)
        {
            this.node=node;
            this.s=s;
            this.nodeSum=nodeSum;
        }
    }
}

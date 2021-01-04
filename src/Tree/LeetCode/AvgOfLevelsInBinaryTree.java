package Tree.LeetCode;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AvgOfLevelsInBinaryTree {
    TreeNode root;
    List<Double> res;



    public AvgOfLevelsInBinaryTree(TreeNode root)
    {
        this.root=root;
        res=new ArrayList<>();
        helper(root);
        System.out.println(res);
    }
    private void helper(TreeNode root)
    {
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty())
        {
            int size=qu.size();
            double res1=0;
            double avg=0;
            for(int i=0;i<size;i++)
            {
                TreeNode curr=qu.poll();
                res1+=curr.val;
                if(i+1==size)
                {
                    avg=(res1/size);
                    res.add(avg);
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
    }
}

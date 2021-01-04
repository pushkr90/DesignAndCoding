package Tree.LeetcodeMedium;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigZagTraversal {

    TreeNode root;
    List<List<Integer>> res;
    boolean zigzag;
    public BinaryTreeZigZagTraversal(TreeNode root)
    {
        this.root=root;
        res=new ArrayList<>();
        zigzag=false;
        helper(root);
        System.out.println(res);

    }
    public  void helper(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }

        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty())
        {
            int size=qu.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=qu.poll();
                if(zigzag)
                {
                    temp.add(0,curr.val);
                }
                else
                {
                    temp.add(curr.val);
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
            zigzag=!zigzag;
            res.add(temp);
        }


    }

}

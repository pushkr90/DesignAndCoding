package Tree.LeetCode;

import Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BalancedBinaryTree {
    TreeNode root;
    Boolean found;
    public BalancedBinaryTree(TreeNode root)
    {
        this.root=root;
        found=true;
        helper(root);
        System.out.println(found);
    }

    public void helper(TreeNode root)
    {
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty())
        {

                TreeNode curr=qu.poll();
                if((curr.right!=null && curr.val!=curr.right.val)||(curr.left!=null && curr.val!=curr.left.val ))
                {
                    found=false;

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

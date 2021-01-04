package Tree.LeetcodeMedium;

import Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LCA2
{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
    {
        String[] s1  ;
        String[] s2 ;
        Queue<queueVar> queue = new LinkedList<>();
        queue.offer(new queueVar(root,root.val+""));
        while (!queue.isEmpty())
        {
            queueVar var = queue.poll();
            if (var.node == p)
            {
                s1 = var.s.split(",");
            }
            if (var.node==q)
            {
                s2 = var.s.split(",");
            }
            if (var.node.left!=null)
                queue.offer(new queueVar(var.node.left, var.s+","+var.node.left.val));
            if (var.node.right!=null)
                queue.offer(new queueVar(var.node.right, var.s+","+var.node.right.val));
        }
       return new TreeNode(5);
    }
    class queueVar
    {
        TreeNode node;
        String s;

        public queueVar(TreeNode node, String s) {
            this.node = node;
            this.s = s;
        }
    }

}

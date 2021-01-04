package Tree;

import pacakge.com.OOD.parkingLot.ParkingLot;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterativeTraversal {

    protected void InOrder(TreeNode root)
    {
        Stack<TreeNode> ans=new Stack<TreeNode>();
        //ans.add(root);
        while( root!=null ||!ans.empty())
        {
            while(root!=null)
            {

                ans.push(root);
                root=root.left;
            }
            root=ans.pop();
            System.out.print(root.val+" ");
            root=root.right;
        }
    }
    protected void PreOrder(TreeNode root)
    {
        Queue<TreeNode> queue=new LinkedList<TreeNode>();

        queue.add(root);
        while(!queue.isEmpty())
        {
            TreeNode curr=queue.poll();
            System.out.print(curr.val+" ");
            if(curr.left!=null)
            {
                queue.offer(curr.left);
            }
            if (curr.right!=null)
            {
                queue.offer(curr.right);
            }
        }
    }

    protected void DequeueInOrder(TreeNode root)
    {
        Deque<TreeNode> dq=new LinkedList<TreeNode>();

        while(root!=null||!dq.isEmpty())
        {
            while(root!=null)
            {
                dq.addFirst(root);
                root=root.left;
            }
            root=dq.removeFirst();
            System.out.print(root.val+" ");
            root=root.right;

        }

    }

    protected void DequeuePreOrder(TreeNode root)
    {
        Deque<TreeNode> dq=new LinkedList<TreeNode>();
        dq.addLast(root);
        while (!dq.isEmpty())
        {
            TreeNode curr = dq.removeFirst();
            System.out.print(curr.val + " ");
            if (curr.left != null)
            {
                dq.addLast(curr.left);
            }
            if (curr.right != null)
            {
                dq.addLast(curr.right);
            }
        }
    }

    protected void PostOder(TreeNode root)
    {
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty())
        {

            TreeNode curr= stack.peek();
            if(curr.left==null && curr.right==null)
            {
                TreeNode curr1=stack.pop();
                System.out.print(curr1.val+" ");
            }
            if(curr.right!=null)
            {
                stack.push(curr.right);
                curr.right=null;
            }
            if(curr.left!=null)
            {
                stack.push(curr.left);
                curr.left=null;
            }
        }
    }

    protected void DequeuePostOder(TreeNode root)
    {
        Deque<TreeNode> dq=new LinkedList<TreeNode>();

        dq.addLast(root);
        while(!dq.isEmpty())
        {
            TreeNode curr=dq.getLast();
            if(curr.left==null && curr.right==null)
            {
                TreeNode curr1=dq.removeLast();
                System.out.print(curr1.val+" ");
            }
            if(curr.right!=null)
            {
                dq.addLast(curr.right);
                curr.right=null;
            }
            if(curr.left!=null)
            {
                dq.addLast(curr.left);
                curr.left=null;
            }
        }
    }

}

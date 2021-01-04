package Tree.LeetcodeMedium;

import Tree.TreeNode;
import pacakge.com.OOD.parkingLot.ParkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BoundaryOfBinaryTree
{
    TreeNode root;
    List<Integer> res;
    Stack<TreeNode> stack;
    public BoundaryOfBinaryTree(TreeNode root)
    {
        this.root = root;
        res = new ArrayList<>();
        stack=new Stack<>();
        res.add(root.val);
        goleft(root.left);
        addLeaves(root);
        goright(root.right);
        stackadd();
        System.out.println(res);

    }
    protected void goright(TreeNode root)
    {
        if(root.right!=null || root.left!=null)
        {
            System.out.println(root.val);
            stack.push(root);
        }
        if(root.right!=null)
        {
            goright(root.right);
        }
        if(root.left!=null&& root.right==null)
        {
            goright(root.left);
        }


    }
    protected void stackadd()
    {
        while(!stack.isEmpty())
        {
            res.add(stack.pop().val);
        }
    }
    protected void goleft(TreeNode root)
    {
        if(root!=null)
        {
       if(root.left!=null || root.right!=null)
       {
           System.out.println("goleft value added = "+root.val);
           res.add(root.val);
       }
        if(root.left!=null)
        {
            goleft(root.left);
        }
        if(root.left==null && root.right!=null)
        {
            goleft(root.right);
        }
        }
    }
    protected void addLeaves(TreeNode root)
    {
        if(root.left==null && root.right==null)
        {
            System.out.println("leave added  = "+root.val);

            res.add(root.val);
        }
        if(root.left!=null)
        {
            addLeaves(root.left);
        }
        if(root.right!=null)
        {
            addLeaves(root.right);
        }
    }


}

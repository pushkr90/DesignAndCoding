package Tree.LeetcodeMedium;

import Tree.TreeNode;

import java.util.LinkedList;
import java.util.Stack;

public class FlattenBinaryTreeToLinkedList {
    TreeNode root;
    Stack<TreeNode> stack;
    public FlattenBinaryTreeToLinkedList(TreeNode root)
    {
        this.root=root;
      stack=new Stack<>();
        stack.push(root);
        helper();
    }
    private void helper()
    {
        TreeNode curr=stack.pop();
        if(curr.left!=null)
        {
            stack.push(curr.left);
        }
        if(curr.right!=null)
        {
            stack.push(curr.right);
        }
        if(!stack.isEmpty())
        {
            curr.right=stack.peek();
        }
        curr.left=null;



    }
}

package Tree.LeetCode;

import Tree.TreeNode;

import java.util.Arrays;

public class SecondMinimumNode {
    TreeNode root;
    int[] arr;
    public SecondMinimumNode(TreeNode root)
    {
        this.root=root;
        arr=new int[]{-1,-1};
        arr[0]=root.val;
        helper(root);

        System.out.println(arr[1]+" "+arr[0]);

    }

    public void helper(TreeNode root)
    {

        if(arr[0]>root.val)
        {
            arr[0]=root.val;
        }
        else if(root.val>arr[0] && (root.val<arr[1]||arr[1]<0))
        {
            arr[1]=root.val;
        }
        if(root.left!=null)
        {
            helper(root.left);
        }
        if(root.right!=null)
        {
            helper(root.right);
        }
    }


}

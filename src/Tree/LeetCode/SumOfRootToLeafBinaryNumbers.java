package Tree.LeetCode;

import Tree.Tree;
import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SumOfRootToLeafBinaryNumbers {
    TreeNode root;
    int res;
    List<String> res1;

    public SumOfRootToLeafBinaryNumbers(TreeNode root)
    {
        this.root=root;
        res=0;
        res1=new ArrayList<>();
        helper(root,root.val+"");
        System.out.println(res);


    }
    public void helper(TreeNode root,String push)
    {
       if(root.left==null && root.right==null)
       {
           System.out.println(push);
           res += Integer.parseInt(push,2);
           //res1.add(push);
       }
        if(root.left!=null)
        {
            helper(root.left,push+root.left.val+"");
        }
        if(root.right!=null)
        {
            helper(root.right, push+root.right.val+"");
        }
    }

    class storage{
        TreeNode root;
        String s;
        public storage(TreeNode root, String s)
        {
            this.root=root;
            this.s=s;
        }
    }

}

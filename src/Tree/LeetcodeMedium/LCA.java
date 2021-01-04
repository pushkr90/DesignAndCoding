package Tree.LeetcodeMedium;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LCA {
    String[] str1;
    String[] str2;
    public LCA()
    {

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
    {

        helper(root,p,q,root.val+"");
        System.out.println(Arrays.toString(str1));
        System.out.println(Arrays.toString(str2));
        TreeNode lca;
        int sizeres= str1.length;
        int sizeres1= str2.length;
        int i=0,j=0;
        int result = 0;
        while (i< str1.length && j< str2.length)
        {
            if (str1[i].equals(str2[j]))
            {
                i++;
                j++;
                continue;
            }
            else
            {
                result+= Integer.parseInt(str1[i-1]);
                break;
            }

        }
        TreeNode res = new TreeNode(result);
        return res;
    }

    public void helper(TreeNode root,TreeNode p,TreeNode q,String push)
    {
       if(root.val==p.val )
       {
            str1 = push.split(",");
            System.out.println(str1);
       }
       if (root.val==q.val)
       {
           str2 = push.split(",");
       }
       if(root.left!=null)
       {
           helper(root.left,p,q,push+","+root.left.val);
       }
       if(root.right!=null)
       {
           helper(root.right,p,q,push+","+root.right.val);
       }

    }

    class builder{
        TreeNode node;
        String s;
        public builder(TreeNode node,String s)
        {
            this.node=node;
            this.s=s;
        }
    }
}

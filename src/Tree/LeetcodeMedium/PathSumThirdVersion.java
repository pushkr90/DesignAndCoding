package Tree.LeetcodeMedium;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PathSumThirdVersion {
    TreeNode root;
    int sum;
    int res;
    List<Integer> list;
    public PathSumThirdVersion(TreeNode root,int sum)
    {
        this.root=root;
        this.sum=sum;
        res=0;
        list=new ArrayList<>();
        helper(root,sum);System.out.println(res);
    }


    private void helper(TreeNode root,int sum)
    {
        if(root==null)
        {
            return;
        }
        list.add(root.val);
        if(root.left!=null) {
            helper(root.left, sum);
        }
        if(root.right!=null)
        {
        helper(root.right,sum);
        }
        int temp=0;
        for(int i=list.size()-1;i>=0;i--)
        {
            temp+=list.get(i);
            if(temp==sum)
            {
                res++;
            }
        }

        list.remove(list.size()-1);

    }



    /*this function gives root to leaf path count to a given sum
    public void helper(TreeNode root,int sum)
    {sum=sum-root.val;
        if(sum==0 && root.left==null && root.right==null)
        {
            res++;
        }


        if(root.left!=null)
        {
            helper(root.left,sum);

        }
        if(root.right!=null)
        {
            helper(root.right,sum);
        }
    }*/


}

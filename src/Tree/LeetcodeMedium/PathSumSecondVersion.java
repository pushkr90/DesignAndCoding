package Tree.LeetcodeMedium;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumSecondVersion {
    TreeNode root;
    int sum;
    List<List<Integer>> res;
    public PathSumSecondVersion(TreeNode root,int sum)
    {
        this.root=root;
        this.sum=sum;
        res=new ArrayList<>();
        List<Integer> templist=new ArrayList<>();
        templist.add(root.val);
        helper(root,sum-root.val,templist);
        System.out.println( res);

    }
    public void helper(TreeNode root,int sum,List<Integer> templist)
    {
        if(sum==0 && root.left==null && root.right==null)
        {
            res.add(new ArrayList<>(templist));
        }
        if(root.left!=null)
        {
            templist.add(root.left.val);
            helper(root.left,sum-root.left.val,templist);
            templist.remove(templist.size()-1);
        }
        if(root.right!=null)
        {
            templist.add(root.right.val);
            helper(root.right,sum-root.right.val,templist);
            templist.remove(templist.size()-1);
        }

    }



}

package Tree.LeetCode;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class CousinsInBinaryTree {
    TreeNode root;
    int x;
    int y;
  List<storage> res;
    public CousinsInBinaryTree(TreeNode root,int x,int y)
    {
        this.root=root;
        this.x=x;
        this.y=y;
        res=new ArrayList<>();
        helper(root,0,x,y);
        System.out.println( check(res));


    }
    private boolean check(List<storage> res)
    {
        int level1=res.get(0).level;
        int level2=res.get(1).level;
        if(level1==level2 &&  res.get(0).parent.val!=res.get(1).parent.val)
        {
            return true;

        }
        return false;
    }

    private void helper(TreeNode root,int level,int x,int y)
    {

        if(root==null)
        {
            return;
        }
        if(root.left!=null && (root.left.val==x||root.left.val==y))
        {
            storage s=new storage(root,level);
            res.add(s);
        }
        if(root.right!=null && (root.right.val==x||root.right.val==y))
        {
            storage s=new storage(root,level);
            res.add(s);
        }
        if(root.left!=null)
        {
            helper(root.left,level+1,x,y);
        }
        if(root.right!=null)
        {
            helper(root.right,level+1,x,y);
        }

    }

    class storage{

        TreeNode parent;
        int level;
        public storage(TreeNode parent,int level)
        {
            this.parent=parent;
            this.level=level;

        }
    }


}

package Tree.LeetCode;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    TreeNode node1;
    TreeNode node2;
    List<Integer> l1;
    List<Integer> l2;

    public LeafSimilarTrees(TreeNode node1,TreeNode node2)
    {
        this.node1=node1;
        this.node2=node2;
        l1=new ArrayList<Integer>();
        l2=new ArrayList<Integer>();
        System.out.println(helper(node1,node2));
    }
    public boolean helper(TreeNode node1, TreeNode node2)
    {
        if(node1!=null)
        {
            add(node1,l1);
        }
        if(node2!=null)
        {
            add(node2,l2);
        }

        if(l1.size()==l2.size())
        {
            for(int i=0;i<l1.size();i++)
            {
              if(l1.get(i)!=l2.get(i))
              {
                  return false;
              }
            }
            return true;
        }
        else
        {
            return false;
        }


    }
    public void add(TreeNode root,List<Integer> l)
    {
        if(root!=null && root.right==null && root.left==null)
        {
            l.add(root.val);
        }
        if(root.left!=null)
        {
            add(root.left,l);
        }
        if(root.right!=null)
        {
            add(root.right,l);
        }
    }

}

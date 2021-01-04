package Tree.LeetcodeMedium;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    TreeNode root;
    List<Integer> res;
    List<Integer> result;
    List<List<Integer>> res1;
    public BinaryTreeRightSideView(TreeNode root)
    {
      this.root=root;
      res1=new ArrayList<>();
      res=new ArrayList<>();
      result=new ArrayList<>();
        helper(root);

        System.out.println(result);
    }

    public void helper(TreeNode root)
    {
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty())
        {
            int size=qu.size();
            List<Integer> temp=new ArrayList<>();

            for(int i=0;i<size;i++)
            {
                TreeNode curr=qu.poll();
                if(i==0)
                {
                    result.add(curr.val);
                }

                if(curr.left!=null)
                {
                    qu.offer(curr.left);
                }
                if(curr.right!=null)
                {
                    qu.offer(curr.right);
                }

            }


        }


    }
}

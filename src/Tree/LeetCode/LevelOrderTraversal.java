package Tree.LeetCode;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    List<List<Integer>> res;
    TreeNode root;
    List<List<Integer>> res1;



    public LevelOrderTraversal(TreeNode root)
    {
        this.root=root;
        res=new ArrayList<>();
        res=build(root);
        res1 =new ArrayList<>();
        recursive(root,0);
    }

    public List<List<Integer>> build(TreeNode root)
    {

        Queue<TreeNode> qu=new LinkedList<>();

        qu.offer(root);
        while(!qu.isEmpty())
        {

            List<Integer> temp=new ArrayList<>();
            int size=qu.size();
            TreeNode curr;
            for(int i=0;i<size;i++)
            {
                 curr=qu.poll();
                temp.add(curr.val);
                if(curr.left!=null)
                {
                    qu.offer(curr.left);
                }
                if(curr.right!=null)
                {
                    qu.offer(curr.right);
                }
            }
            res.add(temp);


        }
        System.out.println(res);


        return res;
    }

    public void recursive(TreeNode root,int level)
    {
            if(level==res1.size())
            {
                res1.add(new ArrayList<>());
            }
            res1.get(level).add(root.val);
            if(root.left!=null)
            {
                recursive(root.left,level+1);
            }
            if(root.right!=null)
            {
                recursive(root.right,level+1);
            }
            System.out.println();
            System.out.print("recursion->"+res1);
            return ;

    }


}

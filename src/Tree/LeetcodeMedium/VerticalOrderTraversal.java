package Tree.LeetcodeMedium;

import Tree.TreeNode;

import java.util.*;

public class VerticalOrderTraversal
{
    TreeNode root;
    List<List<Integer>> res;
    TreeMap<Integer,List<Integer>>map;
    Queue<customNode> qu;
    public VerticalOrderTraversal(TreeNode root)
    {
        this.root=root;
        res=new ArrayList<>();
        map=new TreeMap<>();
        qu=new LinkedList<>();
        customNode c=new customNode(root,0);
        qu.offer(c);

        helper(root);
        runner();

        System.out.println(res);

    }
    public void runner()
    {
        for(Map.Entry<Integer,List<Integer>> each:map.entrySet())
        {
            res.add(each.getValue());

        }
    }
    public void helper(TreeNode root)
    {
        while(!qu.isEmpty())
        {
            customNode c=qu.poll();
                if(!map.containsKey(c.position))
                {
                    map.put(c.position,new ArrayList<>());
                }
                map.get(c.position).add(c.Node.val);
                if(c.Node.left!=null)
                {
                    customNode c1=new customNode(c.Node.left,c.position-1);
                    qu.offer(c1);
                }
                if(c.Node.right!=null)
                {
                    customNode c2=new customNode(c.Node.right,c.position+1);
                    qu.offer(c2);
                }
        }

    }
    class customNode
    {
        TreeNode Node;
        int position;
        public customNode(TreeNode Node,int position)
        {
            this.Node=Node;
            this.position=position;
        }
    }
}

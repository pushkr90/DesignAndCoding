package Tree.LeetcodeMedium;

import Tree.TreeNode;

import java.util.*;

public class NodesKdistance {
    TreeNode root;
    int K;
    TreeNode target;
    HashMap<Integer, List<Integer>> map;
    Queue<Integer> qu;
    List<Integer> res;
    HashSet<Integer> set;
    public NodesKdistance(TreeNode root, int K, TreeNode target)
    {
        this.root=root;
        this.K=K;
        this.target=target;
        map=new HashMap<>();
        qu=new LinkedList<>();
        res=new ArrayList<>();
        set=new HashSet<>();
        buildMap(root);
        qu.offer(target.val);
        runner(K);
        System.out.println(res);

    }
    public void runner(int K)
    {
        while(!qu.isEmpty()||K==0)
        {
            int size = qu.size();
            for (int i = 0; i < size ; i++)
            {
                int curr = qu.poll();
                set.add(curr);
                for (int each : map.get(curr))
                {
                    if (!set.contains(each))
                    {
                        qu.offer(each);
                    }
                }
            }
            K--;
            if (K == 0)
            {
                while(!qu.isEmpty())
                {
                    res.add(qu.poll());
                }
            }
        }
    }
    protected void buildMap(TreeNode root)
    {
        if(!map.containsKey(root.val))
        {
            map.put(root.val,new ArrayList<>());
        }
        if(root.left!=null)
        {
            map.get(root.val).add(root.left.val);
            if(!map.containsKey(root.left.val))
            {
                map.put(root.left.val,new ArrayList<>());
            }
            map.get(root.left.val).add(root.val);
            buildMap(root.left);
        }
        if(root.right!=null)
        {
            map.get(root.val).add(root.right.val);
            if(!map.containsKey(root.right.val))
            {
                map.put(root.right.val,new ArrayList<>());
            }
            map.get(root.right.val).add(root.val);
            buildMap(root.right);
        }
    }
}

package Tree.LeetCode;

import Tree.TreeNode;

public class InvertTree {
    TreeNode root;

    public InvertTree(TreeNode root)
    {
        this.root=root;
        //dfs(root);
        System.out.println(dfs(root));
    }
    public TreeNode dfs(TreeNode root)
    {
        if(root==null)
        {
            return null;
        }
        TreeNode node=new TreeNode(root.val);
        node.right=dfs(root.left);
        node.left=dfs(root.right);

        return node;
    }
}

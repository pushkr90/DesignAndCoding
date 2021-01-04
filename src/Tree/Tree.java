package Tree;

import Tree.LeetCode.*;
import Tree.LeetcodeMedium.*;

public class Tree {

    public static void main(String[] args)
    {
        //String[] arr={ "1", "2","3", "4", "5", "6", "6", "6", "6" };
        String[]arr1={"15","1","6","0","3","null","8","null","null","2","4","null", "null", "7", "null", "null"};
        //Integer[] arr={15,1,6,0,3,null, 8,null,null,2,4,null, null, 7, null, null};
        Integer[] arr={3,5,1,6,2,9,8,null,null,7,4};
        Integer[] arr3={5,4,8,11,null,13,4,7,2,null,null,5,1};
        //Integer[] arr3={2,1,3,null,4,null,7};
        Integer[] subtree={1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,2};
        Integer[] subtree1={1,null,1,null,1,null,1,null,1,null,1,2};
        TreeBuilder sub1=new TreeBuilder(subtree);
        TreeBuilder sub2=new TreeBuilder(subtree1);
        sub1.root=sub1.build(sub1.root,0);
        sub2.root=sub2.build(sub2.root,0);


        Integer[] arr2={3,9,20,null,null,15,7};
        //Integer[] arr3 = new Integer[]{11,99,88,77,null,null,66,55,null,null,44,33,null,null,22};
        TreeBuilder a=new TreeBuilder(arr3);
        TreeBuilder b=new TreeBuilder(arr);
        b.root=b.build(b.root,0);

        a.root= a.build(a.root,0);
       /* DfsTraversal b=new DfsTraversal();
        System.out.print("preOrder   :->");
        b.preOrder(a.root);
        System.out.println();

        System.out.print("InOrder  :->");
        b.inOrder(a.root);
        System.out.println();

        System.out.print("PostOrder :->");
        b.postOrder(a.root);
        System.out.println();

        InterativeTraversal I= new InterativeTraversal();
        System.out.print("INOrderItervative :->");
        I.InOrder(a.root);
        System.out.println();


        System.out.print("PreOrderItervative :->");
        I.PreOrder(a.root);
        System.out.println();


        System.out.print("InOrderDequque :->");
        I.DequeueInOrder(a.root);
        System.out.println();



        System.out.print("preOrderDequque :->");
        I.DequeuePreOrder(a.root);
        System.out.println();

        System.out.print("postOrderDequque :->");
       // I.PostOder(a.root);
        System.out.println();

        System.out.print("postOrderDequque :->");
        I.DequeuePostOder(a.root);
        System.out.println();




        int[] in={0,1,2,3,4,15,6,7,8};
        int[] pre={15,1,0,3,2,4,6,8,7};
        Convert convert=new Convert(in,pre);
        a.root = convert.res;
        DfsTraversal c=new DfsTraversal();
        System.out.print("InOrder  :->");
        c.inOrder(a.root);
        System.out.println();

        int[] post={0,2,4,3,1,7,8,6,15};
        InOrderPostOrder Pu=new InOrderPostOrder(in,post);
        a.root=Pu.res;
        DfsTraversal d=new DfsTraversal();
        System.out.print("InOrder with in and post :->");
        d.inOrder(a.root);
        System.out.println();


        LevelOrderTraversal l1=new LevelOrderTraversal(a.root);

       LonleyNode l2=new LonleyNode(a.root);

        MergeTwoBinaryTree me=new MergeTwoBinaryTree(a.root,b.root);
        TreeNode res=me.merge(a.root,b.root);
        DfsTraversal d=new DfsTraversal();
        d.inOrder(res);



       // DiamterOfBinaryTree dia=new DiamterOfBinaryTree(b.root);

        SubtreeOfAnotherTree Sub=new SubtreeOfAnotherTree(sub1.root,sub2.root);
        InvertTree inv=new InvertTree(b.root);
        BinaryTreePath bc=new BinaryTreePath(b.root);

        CousinsInBinaryTree cou=new CousinsInBinaryTree(b.root,5,4);*/

       // MaximumDepthOfTree Mx=new MaximumDepthOfTree(b.root);
       // SumOfleftLeaves su=new SumOfleftLeaves(b.root);
        //SumOfRootToLeafBinaryNumbers su=new SumOfRootToLeafBinaryNumbers(b.root);
       // AvgOfLevelsInBinaryTree avg=new AvgOfLevelsInBinaryTree(b.root);
       // SecondMinimumNode se=new SecondMinimumNode(a.root);
       // BalancedBinaryTree fo=new BalancedBinaryTree(a.root);
       // SameTree s=new SameTree(a.root,b.root);
       // LeafSimilarTrees le=new LeafSimilarTrees(a.root,b.root);
       // BinaryTreerightSideView bn=new BinaryTreerightSideView(a.root);
       // LCA_Recursion Lc=new LCA_Recursion();
       // System.out.println((Lc.helper(a.root,new TreeNode(5),new TreeNode(8))).val);
       // VerticalOrderTraversal v=new VerticalOrderTraversal(a.root);
        //NodesKdistance n=new NodesKdistance(a.root,2,new TreeNode(5));
        //BoundaryOfBinaryTree i=new BoundaryOfBinaryTree(a.root);
        //BinaryTreeZigZagTraversal ba=new BinaryTreeZigZagTraversal(a.root);
        //PathSumThirdVersion path=new PathSumThirdVersion(a.root,8);
        PathSumSecondVersion pathsec=new PathSumSecondVersion(a.root,22);











    }
}

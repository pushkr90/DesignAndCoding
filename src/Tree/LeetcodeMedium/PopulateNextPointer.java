package Tree.LeetcodeMedium;

import java.util.LinkedList;
import java.util.Queue;

public class PopulateNextPointer {
    Node root;
    Queue<Node>qu;

    public PopulateNextPointer(Node root)
    {
        this.root=root;
         qu=new LinkedList<>();
        qu.offer(root);
        helper(root);
    }
    private void helper(Node root)
    {
        while(!qu.isEmpty())
        {
            int size=qu.size();
            for(int i=0;i<size;i++)
            {
                Node curr=qu.poll();
                if(i==size-1)
                {
                    curr.next=null;
                }
                else
                {
                    curr.next=qu.peek();
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





    class Node{
        int val;
        Node left;
        Node right;
        Node next;
        public Node()
        {
            this.val=val;

        }
    }
}

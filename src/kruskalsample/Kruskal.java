package kruskalsample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Kruskal
{
    HashMap<Integer,Integer> map=new HashMap<>();
    double TotalCost=0;

    public void KruskalMST(ArrayList<Node> list)
    {
        PopulateMap(list);
        int totalNode= map.size();
        SUSF obj=new SUSF(totalNode);
        sort(list);
       //for(int i=0;i<)

        for(int i=0;i<list.size();i++)
        {
            Node n=list.get(i);

            int a=n.source;
            int b=n.destination;

            Double cost=n.cost;
            if (obj.union(map.get(a),map.get(b)))
            {
                TotalCost+=cost;
            }
        }
        System.out.print(TotalCost);


    }
    protected void sort(ArrayList<Node> list)
    {
        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if(o1.cost>o2.cost)
                {
                    return 1;
                }
                else if(o1.cost<o2.cost)
                {
                    return -1;
                }
                else
                {
                    return 0;
                }
            }
        });
    }
    public void PopulateMap(ArrayList<Node> list)
    {
        int counter=0;
        for(Node each:list)
        {
            if(!map.containsKey(each.source))
            {
                map.put(each.source,counter++);
            }
            if(!map.containsKey(each.destination))
            {
                map.put(each.destination,counter++);
            }
        }
    }


    public static void main(String[] args)
    {


        ArrayList<Node> list = new ArrayList<>();
        list.add(new Node(1, 2, 3));
        list.add(new Node(7, 8, 4));
        list.add(new Node(6, 7, 6));
        list.add(new Node(5, 8, 7));
        list.add(new Node(6, 8, 8));
        list.add(new Node(4, 6, 9));
        list.add(new Node(1, 8, 10));
        list.add(new Node(4, 9, 11));
        list.add(new Node(2, 5, 12));
        list.add(new Node(3, 6, 13));
        list.add(new Node(3, 4, 14));
        list.add(new Node(5, 6, 15));
        list.add(new Node(4, 7, 16));
        list.add(new Node(2, 3, 26));
       // list.add(new Node(7, 8, 4));

        Kruskal k=new Kruskal();
        k.KruskalMST(list);

    }
}

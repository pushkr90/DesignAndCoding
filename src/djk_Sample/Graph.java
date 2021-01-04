package djk_Sample;


import java.util.*;

public class Graph
{

    HashMap<String,Integer> mapVertex=new HashMap<>();
    ArrayList<String> nodeList=new ArrayList<>();
    HashMap<Integer, LinkedList<Edges>> adjList=new HashMap<>();
    int counter=0;
    int [] depart;
    int[] arrival;
    boolean [] visited;
    int time=0;
    ArrayList<Integer> Dfs;

    class Edges
    {
        int EdgeValue;
        int cost;
        public Edges(int EdgeValue,int cost)
        {
            this.EdgeValue=EdgeValue;
            this.cost=cost;
        }

        @Override
        public String toString()
        {
            return "Edges{" +
                     EdgeValue +
                    ", cost=" + cost +
                    '}';
        }
    }
   /* protected void dfs()
    {
        int size=numV();
        depart=new int[size];
        arrival=new int[size];
        visited=new boolean[size];
        for(int i=0;i<size;i++)
        {
            if(!visited[i])
            {
                check(i,Dfs);

            }

        }


    }*/
   /* public boolean check(int i,ArrayList<Integer> Dfs)
    {
        LinkedList<Edges> ls=adjList.get(i);
        for(int j=0;j<ls.size();j++)
        {
            Edges n=ls.get(j);
            int nVal=n.EdgeValue;
           // if(arrival[mapVertex.get(nVal)])


        }
    }*/
    public void addEdge(String from,String to,int cost)
    {
        addVertex(from);
        addVertex(to);
        if(adjList.containsKey(mapVertex.get(from)))
        {
            LinkedList<Edges> l1=adjList.get(mapVertex.get(from));
            l1.add(new Edges(mapVertex.get(to),cost));
            //adjList.put(mapVertex.get(from),l1);
        }
        else
            {
            LinkedList<Edges> l2=new LinkedList<>();
            l2.add(new Edges(mapVertex.get(to),cost));
            adjList.put(mapVertex.get(from),l2);
        }
    }

    public void addVertex(String val)
    {
        if(!mapVertex.containsKey(val))
        {
            mapVertex.put(val,counter++);
            nodeList.add(val);
        }
        return;
    }
    protected int numV()
    {
        return mapVertex.size();
    }

    public void print()
    {
        for(Map.Entry n :adjList.entrySet())
        {
            System.out.println("value of node "+n.getKey()+" -> "+n.getValue());
        }
        System.out.println("ArraysName "+ nodeList);

    }
    public int numOfFanouts(int n)
    {
        LinkedList<Edges> e=adjList.get(n);
        return e.size();
    }


}

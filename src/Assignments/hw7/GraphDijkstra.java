package Assignments.hw7;


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * File Name: GraphDijkstra.java 
 * Implements Dijkstra's algorithms
 * 
 * @author Jagadeesh Vasudevamurthy
 * @year 2019
 */

/*
 * To compile you require: IntUtil.java RandomInt.java Graph.java GraphTest.javs GraphDijkstra.java
 */

class GraphDijkstra
{
	//You can have any number of private variables and private functions
	//DATA GIVEN
	private String t ; //Title
	private String dotFile; //Write tree as a dot file
	private Graph g ;
	String start;
	String end;
	int [] work;
	double [] cost;
	Node[] nodeData;
	PriorityQueue<Node> pq;


	class Node
	{
		boolean visited;
		Double cost;
		int from;
		int Node;


		 Node(boolean visited, Double cost, int from, int Node)
		{
			this.visited=visited;
			this.cost=cost;
			this.from=from;
			this.Node=Node;
		}
		Node(int Node,Double cost)
		{
			this.Node=Node;
			this.cost=cost;
		}


	}
	class NodeComp implements Comparator<Node>{

		@Override
		public int compare(Node o1, Node o2) {
			return o1.cost>o2.cost?1:-1;
		}
	}


	GraphDijkstra(String t, String dotFile, Graph g, String start,String end, int [] work, double [] cost)
	{
		this.t = t ;
		this.dotFile = dotFile ;
		this.g = g ;
		this.start = start;
		this.end = end ;
		this.work = work ;
		this.cost = cost ;
		this.nodeData = new Node[g.getnumV()];
		populate(nodeData);
		initialise(start);
		djk();



		//WRITE YOUR CODE
	}
	public void initialise(String start)
	{
		Node n;
		pq=new PriorityQueue<Node>(new NodeComp());
		if(start.equals("0"))
		{
			 n=new Node(g.insertOrFind(start,true),0.0);
		}
		else
		{
			 n=new Node(6,0.0);
		}
		pq.add(n);
	}

	public Node minCostNode()
	{
		if(!pq.isEmpty())
		{
			Node n=pq.peek();
			if(nodeData[n.Node].visited==false)
			{
				pq.remove();
				return n;
			}
		}
		return null;
	}
	public void djk()
	{
		Node n=minCostNode();
		if(n!=null)
		{
			int node=n.Node;
			System.out.println("Node Found by MinHeap "+node);
			int edges=g.numFanout(node);
			for(int i=0;i<edges;i++)
			{
				int fo = g.getNodeFanout(node,i);
				double we=g.getNodeFanoutEdgeWeightE(node,fo);
				if(we+n.cost<nodeData[fo].cost)
				{
					nodeData[fo].cost=we+nodeData[node].cost;
					nodeData[fo].from=node;
					pq.add(new Node(nodeData[fo].Node,nodeData[fo].cost));
					System.out.println("We are working on Node : "+g.getNodeRealName(nodeData[fo].Node));
				}
				print();
			}
			nodeData[node].visited=true;
			djk();
		}
		else
			{
				return;
			}
	}
	public  void print()
	{
		for(int i=0;i<nodeData.length;i++)
		{
			System.out.print(g.getNodeRealName(nodeData[i].Node)+"    ");

		}
		System.out.println();
		for(int i=0;i<nodeData.length;i++)
		{
			if (nodeData[i].visited==false)
			{
				System.out.print("F"+"    ");
			}
			else {
				System.out.print("T"+"    ");
			}

		}
		System.out.println();
		for(int i=0;i<nodeData.length;i++)
		{
			if (nodeData[i].cost==g.INFINITY)
			{
				System.out.print("L"+"   ");
			}
			else
			{
				System.out.print(nodeData[i].cost+"  ");
			}

		}
		System.out.println();


		for(int i=0;i<nodeData.length;i++)
		{
			System.out.print(g.getNodeRealName(nodeData[i].from)+"    ");
		}
		System.out.println();



	}

	public void populate(Node[] nodeData)
	{
		for(int i=0;i<nodeData.length;i++)
		{
			if(i==0)
			{
				Node n = new Node(false, 0.0, i, i);
				nodeData[i]=n;
			}
			else
				{
			Node n=new Node(false,g.INFINITY,i,i);
			nodeData[i]=n;
			//System.out.println((nodeData[i].from)+"Pushkar");
					}
		}
	}



	//public Node
	
	public static void main(String[] args)
	{
		System.out.println("GraphDijkstra.java starts");
		System.out.println("Use GraphTest.java to test");
		System.out.println("GraphDijkstra.java Ends");
	}
}
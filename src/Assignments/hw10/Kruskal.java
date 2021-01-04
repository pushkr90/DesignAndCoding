package Assignments.hw10; /**
 * File Name: Kruskal.java 
 * Implementation of Kruskal algorithm
 * 
 * To Compile: IntUtil.java RandomInt.java SFSU.java KruskalBase.java Kruskal.java
 * 
 * @author Jagadeesh Vasudevamurthy
 * @year 2019
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

class Kruskal extends KruskalBase
{
	//YOU CAN HAVE ANY NUMBER OF DATA STRUCTURES HERE
	class Node
	{
		int source;
		int destination;
		double cost;
		public Node(int source,int destination,double cost)
		{
			this.source=source;
			this.destination=destination;
			this.cost=cost;
		}
	}
	ArrayList<Node> NodeData;
	int counter;
	double totalcost;
	int edge;
	HashMap<String,Integer> map;
	Kruskal()
	{
		super() ;
		testBench();
	}
	
	@Override
  String inputFileBase() {
    //Change to directory where U have input graph files
    return "/Users/pushkarraj/Downloads/graphdata/";
  }

	@Override
	protected double getMSTCost()
	{
		this.counter =0;
		this.totalcost = 0;
		this.edge =0;
		this.NodeData = new ArrayList<>();
		this.map = new HashMap<>();
		readfile(d.inFileName);
		System.out.println("filename"+d.inFileName);
		sort(NodeData);
		System.out.println("Sorted"+d.inFileName);

		for(int i=0;i<NodeData.size();i++)
		{
			System.out.println(NodeData.get(i).source+" "+NodeData.get(i).destination+" "+NodeData.get(i).cost);
		}
		System.out.println("SORTED"+d.inFileName);

		SUSF s=new SUSF(map.size());
		for(int i=0;i<NodeData.size();i++)
		{
			Node n=NodeData.get(i);
			int a=n.source;
			int b=n.destination;
			/*System.out.println("a"+a);
			System.out.println("b"+b);
			System.out.println("size"+map.size());

			 */
			double cos=n.cost;
			//System.out.println("cost"+cos);

			if (edge>map.size()-2)
			{
				break;
			}

			System.out.println("Src - "+ a+" Dest - "+ b+ "cost "+ cos);

			if(s.U(a,b))
			{
				totalcost+=cos;
				edge++;
			}
			else
			{
				System.out.println("creates Loop ");
			}

		}
		System.out.println("Total Mst :"+ totalcost);
		//WRITE CODE HERE
		return totalcost;
	}

	protected void sort(ArrayList<Node> NodeData)
	{
			Collections.sort(NodeData, new Comparator<Node>() {
				@Override
				public int compare(Node o1, Node o2) {
					if( o2.cost>o1.cost)
					{
						return -1;
					}
					else if(o2.cost<o1.cost)
					{
						return 1;
					}
					else
					{
						return 0;
					}
				}
			});



	}
	protected void readfile(String s)
	{
		try
		{
			BufferedReader br=new BufferedReader(new FileReader(s));
			while (true)
			{
				String l1= br.readLine();
				if(l1==null) break;
				String[] arr=l1.split("[ ]+");
				if(!map.containsKey(arr[0]))
				{
					map.put(arr[0],counter++);
				}
				if(!map.containsKey(arr[1]))
				{
					map.put(arr[1],counter++);
				}
				int l=arr.length;
				if(l==3)
				{
					Node n=new Node(map.get(arr[0]),map.get(arr[1]),Double.parseDouble(arr[2]));
					//Node n=new Node(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),Double.parseDouble(arr[2]));
					NodeData.add(n);
				}
			}
			br.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	//CANNOT CHANGE ANYTHING BELOW
	public static void main(String[] args) {
		if (false)
		{ //Make it to true to write to a file
			String s = "C:\\scratch\\output.txt"; //Chanhe this line
			System.out.println("Writing to " + s) ;
			try {
				System.setOut(new PrintStream(new FileOutputStream(s)));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String version = System.getProperty("java.version");
		System.out.println("Java version used for this program is " + version);
		System.out.println("Kruskal problem STARTS");
		Kruskal m = new Kruskal() ;
		System.out.println("All tests passed");
		System.out.println("If you have enjoyed solving this interview problem write a review for me on linkedln");
		System.out.println("Kruskal problem ENDS");
	}
}
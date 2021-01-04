package Assignments.hw7;

import java.util.Arrays;

/**
 * File Name: GraphDfs.java 
 * Depth First Search on a graph
 * 
 * @author Jagadeesh Vasudevamurthy
 * @year 2019
 */

/*
 * To compile you require: IntUtil.java RandomInt.java Graph.java GraphTest.javs GraphDfs.java
 */

class GraphDfs
{
	//You can have any number of private variables and private functions
	private String t ;
	private Graph g ;
     //Output
	boolean [] cycle;
	int [] work ;
	int [] size ;
	int [] dfsorder;
	int time;
	int[] depart;
	int [] arrival;
	boolean[] visited;
	int l;

	
	GraphDfs(String t, Graph g, boolean [] cycle, int [] work, int [] size, int [] dfsorder)
	{
		this.t = t ;
		this.g = g ;
		this.cycle = cycle ;
		this.work = work ;
		this.size = size ;
		this.dfsorder = dfsorder ;

		//WRITE YOUR CODE
		// CheckCycle (cycle, g,dfsorder);
		depart=new int[g.getnumV()];
		arrival=new int[g.getnumV()];

		visited=new boolean[g.getnumV()];
		l=0;

		for(int i=0;i<g.getnumV();i++)
		{

			if(!visited[i])
			{
				check2(i,dfsorder);
			}
		}

		System.out.println("deaprt"+ Arrays.toString(depart));
		System.out.println("arri"+ Arrays.toString(arrival));
		System.out.println("arri"+ Arrays.toString(dfsorder));

		System.out.println("cycle"+Arrays.toString(cycle));


	}
	public void check2(int i,int[] dfsorder)
	{
		arrival[i]=++time;
		visited[i]=true;
		int fanout=g.numFanout(i);
		for(int j=0;j<fanout;j++)
		{

			int fo = g.getNodeFanout(i,j) ;
			if(!visited[fo])
			{
				check2(fo,dfsorder);
			}
			else if(depart[fo]==0)
			{
				cycle[0]=true;
			}

		}
		dfsorder[l++]=i;
		depart[i]=++time;
	}

	public static void main(String[] args) {
		System.out.println("GraphDfs.java starts");
		System.out.println("Use GraphTester.java to test");
		System.out.println("GraphDfs.java Ends");
	}
}
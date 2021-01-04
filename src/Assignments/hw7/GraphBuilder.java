package Assignments.hw7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


/**
 * File Name: GraphBuilder.java 
 * All routines that builds Graph
 * 
 * @author Jagadeesh Vasudevamurthy
 * @year 2019
 */

/*
 * To compile you require: IntUtil.java RandomInt.java Graph.java GraphTest.java GraphBuilder.java
 */

class GraphBuilder{
	private Graph g ;
	//You can have any number of private variables and private funcions
	
	GraphBuilder(Graph g, String f) {
		this.g = g ;
		//WRITE YOUR CODE
		ReadFile(f);
	}

	private void ReadFile(String f)
	{
		int numlines=0;
		GraphTest.GraphType t = g.getType();
		try {
			BufferedReader br=  new BufferedReader(new FileReader(f));
			StringBuilder sb = new StringBuilder();
			String lastLine = null;
			int noreadLine =0;
			while (true)
			{
				String l1 = br.readLine();
				if (l1==null)
					break;
				else {
					String line = l1.trim();
					lastLine = line;
					String delims = "[ ]+";
					String[] s = line.split(delims);
					int l = s.length;
					if (l==3)
					{
						++numlines;
					}
					else if (l==2)
						++numlines;
					else
						++noreadLine;

					if (l==2 || l==3)
					{
						for (int j=0;j<2;j++)
						{
							g.insertOrFind(s[j],false);
						}
						double w = 0;
						int p1 = g.insertOrFind(s[0],true);
						int p2 = g.insertOrFind(s[1],true);

						if (l==3)
							w = Double.parseDouble(s[2]);
						g.createEdge(p1,p2,w,true);
						g.createEdge(p2,p1,w,false);

						if (p1!=p2)
						{
							if (t== GraphTest.GraphType.UNDIRECTED || t == GraphTest.GraphType.WEIGHTED_UNDIRECTED)
							{
								g.createEdge(p2,p1,w,true);
								g.createEdge(p1,p2,w,false);
							}
						}
					}
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		System.out.println("GraphBuilder.java starts");
		System.out.println("Use GraphTester.java to test");
		System.out.println("GraphBuilder.java Ends");
	}
}
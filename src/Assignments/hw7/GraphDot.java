package Assignments.hw7;

import java.io.*;


/**
 * File Name: GraphDot.java 
 * Writes graph as a dot file
 * 
 * @author Jagadeesh Vasudevamurthy
 * @year 2019s
 */

/*
 * To compile you require: IntUtil.java RandomInt.java Graph.java GraphTest.javs GraphDot.java
 */

class GraphDot{
	private Graph g ;
	private String fname;
	//You can have any number of private variables

	GraphDot(Graph g, String s)
	{
		this.g = g ;
		this.fname = s ;
		//WRITE CODE
		build(g,s);

	}
	protected void build(Graph g,String s)
	{
		try
		{
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(s)));
			out.write("digraph G {");
			out.newLine();
			out.newLine();



			 if(g.getGraphType()=="WEIGHTED_UNDIRECTED GRAPH")
			{
				out.write("edge[dir=none,color=orange]");
				out.newLine();


				for(int i=0;i<g.getnumV();i++)
				{
					String n=g.getNodeRealName(i);
					int k=g.numFanout(i);
					for(int j=0;j<k;j++)
					{
						int fo=g.getNodeFanout(i,j);
						String nf=g.getRealName(fo);
						float w= (float) g.getNodeFanoutEdgeWeightENoCheck(i,fo);
					//	System.out.println(w+"PUSHKAR");
						if(i<=fo)
						{
							out.write(n + "->" + nf+"["+"label"+"="+w+"]");
							out.newLine();

						}

					}
				}
				out.close();
			}
			 else if(g.getGraphType()=="UNDIRECTED GRAPH")
			{
				out.write("edge[dir=none,color=orange]");
				out.newLine();

				for(int i=0;i<g.getnumV();i++)
				{
					String n = g.getNodeRealName(i);
					int k= g.numFanout(i);
					for(int j=0;j<k;j++) {
						int fo = g.getNodeFanout(i, j);
						String nf = g.getRealName(fo);
						if (i <= fo) {
							out.write(n + "->" + nf+";");
							out.newLine();
						}

					}

				}
				out.close();
			}
			else if(g.getGraphType()=="DIRECTED GRAPH")
			{
				out.write("edge[color=orange]");
				out.newLine();
				for(int i=0;i<g.getnumV();i++)
				{
					String n=g.getNodeRealName(i);
					int k=g.numFanout(i);
					for(int j=0;j<k;j++)
					{
						int fo=g.getNodeFanout(i,j);
						String nf=g.getRealName(fo);
					//	if (i <= fo) {
							out.write(n + "->" + nf+";");
							out.newLine();
					//	}



					}
				}
				out.close();
			}
			else if(g.getGraphType()=="WEIGHTED_DIRECTED GRAPH")
			 {
				 out.write("edge[color=orange]");
				 out.newLine();
				 for(int i=0;i<g.getnumV();i++)
				 {
					 String n = g.getNodeRealName(i);
					 int k= g.numFanout(i);
					 for(int j=0;j<k;j++) {
						 int fo = g.getNodeFanout(i, j);
						 String nf=g.getRealName(fo);

						 float w= (float) g.getNodeFanoutEdgeWeightENoCheck(i,fo);
						// System.out.println(w+"PUSHKAR");
						// if(i<=fo)
						 //{
							 out.write(n + "->" + nf+"["+"label"+"="+w+"]");
							 out.newLine();

						// }


					 }

				 }
				 out.close();
			 }

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}



	public static void main(String[] args) {
		System.out.println("GraphDot.java starts");
		System.out.println("Use GraphTester.java to test");
		System.out.println("GraphDot.java Ends");
	}
}
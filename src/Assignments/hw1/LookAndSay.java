package Assignments.hw1;

/**
 * File Name: LookAndSay.java 
 * LookAndSay concrete class
 * 
 * 
 * To Compile: IntUtil.java RandomInt.java LookAndSay.java LookAndSayBase.java
 * 
 * @author Jagadeesh Vasudevamurthy
 * @year 2019
 */

public class LookAndSay extends LookAndSayBase{
	LookAndSay() {
	 //NOTHING CAN BE CHANGED HERE
		testBed() ;
	}

	@Override
	protected String lookAndSay(String s) {
		//NOTHING CAN BE CHANGED HERE
		return alg(s) ;
	}

	@Override
	protected String lookAndSay(int n) {
		//NOTHING CAN BE CHANGED HERE
		return alg(n) ;
	}
	
	private String alg(String s)
	{
	  //WRITE CODE
		//You can have any number of private functions and variables
		StringBuilder sb=new StringBuilder();
		int counter=1;
		for(int i=1;i<=s.length();i++)
		{

			if(i==s.length()||s.charAt(i-1)!=s.charAt(i))
			{
				sb.append(counter).append(s.charAt(i-1));
				counter=1;
			}else
			{
				counter++;

			}
		}
		return sb.toString();


	}

	private String alg(int n)
	{
		//WRITE CODE
		//You can have any number of private functions and variables
		String res="1";
		if(n==1)
		{
			return res;
		}

		for(int i=1;i<n;i++)
		{
			StringBuilder sb=new StringBuilder();
			int counter=1;
			for(int j=1;j<=res.length();j++)
			{
				if(j==res.length()||res.charAt(j)!=res.charAt(j-1))
				{
					sb.append(counter).append(res.charAt(j-1));
					counter=1;
				}
				 else
				{
					counter++;
				}
			}
			res=sb.toString();
		}
		return res;


	}

	public static void main(String[] args) {
		//NOTHING CAN BE CHANGED HERE
		System.out.println("LookAndSay problem STARTS");
		LookAndSay m = new LookAndSay() ;
		System.out.println("All LookAndSay tests passed. You are genius");
		System.out.println("LookAndSay problem ENDS");
	}
}

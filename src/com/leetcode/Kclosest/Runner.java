package com.leetcode.Kclosest;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args)
    {
        int[][] points=new int[][]{{1,1},{1,0},{-2,2},{7,8}};
        int K=2;

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        System.out.print("Enter the 2 d array ");
        int[][] point = new int[4][];
        for (int i=0;i<point.length;i++)
        {
            point[i] = new int[2];
            for (int j=0;j<2;j++)
            {
                point[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        KClosest obj=new KClosest(point,k);
        int[][]res=obj.work(point,k);
        System.out.print("result is ");
        for (int i=0;i<res.length;i++)
        {
            System.out.print (" "+ Arrays.toString(res[i]));
        }





    }
}

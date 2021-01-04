package com.leetcode.Kclosest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[][] points=new int[][]{{1,1},{1,0},{-2,2},{7,8}};
        int K=2;

        int[][] result = solution.work(points,K);
        System.out.print("result is ");
        for (int i=0;i<result.length;i++)
        {
            System.out.print (" "+ Arrays.toString(result[i]));
        }
    }
    public int[][] work(int[][]points,int K)
    {
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2)
            {
                int ab=o1[0]*o1[0]+o1[1]*o1[1];
                int bc=o2[0]*o2[0]+o2[1]*o2[1];
                if(ab>bc)
                {
                    return -1;
                }
                else if(ab<bc)
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
        });
        int[][] res=new int[K][2];
        for(int[] each: points)
        {
            pq.add(each);
            if(pq.size()>K)
            {
                pq.poll();
            }
        }
        while(K>0)
        {
            res[--K]=pq.poll();
            //System.out.println(Arrays.toString(res[K]));
        }
        return res;
    }
}

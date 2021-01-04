package com.leetcode.Kclosest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosest
{
    int[][]points;
    int K;
    public KClosest(int[][]points,int K)
    {
      this.points=points;
      this.K=K;
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
            System.out.println(Arrays.toString(res[K]));
        }
        return res;
    }
}

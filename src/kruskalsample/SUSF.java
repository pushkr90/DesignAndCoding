package kruskalsample;

import java.util.Arrays;

public class SUSF {
    int[] id;
    int[] height;

    SUSF(int n)
    {
        id=new int[n];
        height=new int[n];
        Arrays.fill(id,-1);
        Arrays.fill(height,0);
    }

    protected int find(int i)
    {
        if(id[i]<0)
        {
            return i;
        }
        id[i]=find(id[i]);
        return id[i];
    }
    protected boolean find(int a ,int b)
    {
        if(find(a)==find(b))
        {
            return true;
        }
        return false;
    }
    protected boolean union(int a,int b)
    {
        int x=find(a);
        int y=find(b);
        if(!find(a,b))
        {
            if(height[x]>height[y])
            {
                id[y]=a;
                id[x]+=-1;
                height[x]+=1;
            }else{
                id[x]=b;
                id[y]+=-1;
                height[y]+=1;

            }
            return true;
        }
        return false;

    }
}

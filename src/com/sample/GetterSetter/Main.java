package com.sample.GetterSetter;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        List<Student> list = new ArrayList<>();
        list.add(new Student(9, "Akanksha", 9));
        list.add(new Student(5, "pushkar", 9));
        list.add(new Student(6, "Anjali", 3));
        HashSet<Integer> set=new HashSet<Integer>();
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i< list.size();i++)
        {
            set.add(list.get(i).getClassRoom());
            if(!map.containsKey(list.get(i).getClassRoom()))
            {
                map.put(list.get(i).getClassRoom(),list.get(i).getName());
            }
            else
            {
                map.put(list.get(i).getClassRoom(),map.get(list.get(i).getClassRoom())+list.get(i).getName());
            }
        }
        for(Map.Entry<Integer,String> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+entry.getValue());
        }
    }
}

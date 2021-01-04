package com.sample.laptop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class runner {
    public static void main(String[] args)
    {
        List<Laptop> laps=new ArrayList<Laptop>();
        laps.add(new Laptop("dell",1200,900));
        laps.add(new Laptop("apple",90,9000));
        laps.add(new Laptop("sukhoi",890,14000));
        Comparator<Laptop> practiceComparator=new Comparator<Laptop>()
        {
            public int compare(Laptop l1,Laptop l2)
            {
                if(l1.getPrice()>l2.getPrice())
                {
                    return 1;
                }else
                {
                    return -1;
                }
            }
        };
        /*using comparable
        Collections.sort(laps);
         */

        for (Laptop l: laps)
        {
            System.out.println(l.getPrice());
        }





    }
}

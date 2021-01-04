package com.sample.laptop;

import java.util.Comparator;

public class Laptop2
{
    private String brand;
    private int ram;
    private int price;
    public Laptop2(String brand,int ram,int price)
    {
        this.brand=brand;
        this.price=price;
        this.ram=ram;
    }
}
class Comparision implements Comparator<Laptop2>
{
    public static void main(String[] args) {
        Laptop2[] lap2 = new Laptop2[3];
        lap2[0] = new Laptop2("Sony",900,10000);
        lap2[1] = new Laptop2("Pushkar",842,89246);
        lap2[2] = new Laptop2("Akanksha",9347,37235);
    }
    @Override
    public int compare(Laptop2 o1, Laptop2 o2) {
        return 0;
    }
}

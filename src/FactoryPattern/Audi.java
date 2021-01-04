package FactoryPattern;

public class Audi extends Car implements Vehicle{

    @Override
    public void details() {
        System.out.println("AUDI");
        System.out.println("AUDI Max Speed is:"+MaxSpeed());
        System.out.println("Total Number of Gears in AUDI is:"+TotalGears());
        System.out.println("Total Number of Speaker in AUDI is:"+TotalSpeakers());
        System.out.println("AUDI Costs:"+Price());
    }



    @Override
    int MaxSpeed() {
        return 100;
    }

    @Override
    int TotalGears() {
        return 5;
    }

    @Override
    int TotalSpeakers() {
        return 10;
    }

    @Override
    int Price() {
        return 100000;
    }
}

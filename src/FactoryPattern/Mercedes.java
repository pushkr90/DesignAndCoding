package FactoryPattern;

public class Mercedes extends Car implements Vehicle {
    @Override
    public void details()
    {
        System.out.println("Mercedes");
        System.out.println("Mercedes Max Speed is:"+MaxSpeed());
        System.out.println("Total Number of Gears in Mercedes is:"+TotalGears());
        System.out.println("Total Number of Speaker in Mercedes is:"+TotalSpeakers());
        System.out.println("Mercedes Costs:"+Price());
    }


    @Override
    int MaxSpeed() {
        return 200;
    }

    @Override
    int TotalGears() {
        return 4;
    }

    @Override
    int TotalSpeakers() {
        return 10;
    }

    @Override
    int Price() {
        return 9000;
    }
}

package FactoryPattern;

public class BMW extends Car implements Vehicle{
    @Override
    public void details()
    {
        System.out.println("BMW");
        System.out.println("BMW Max Speed is:"+MaxSpeed());
        System.out.println("Total Number of Gears in BMW is:"+TotalGears());
        System.out.println("Total Number of Speaker in BMW is:"+TotalSpeakers());
        System.out.println("BMW Costs:"+Price());
    }

    @Override
    int MaxSpeed() {
        return 700;
    }

    @Override
    int TotalGears() {
        return 1;
    }

    @Override
    int TotalSpeakers() {
        return 8;
    }

    @Override
    int Price() {
        return 34567;
    }
}

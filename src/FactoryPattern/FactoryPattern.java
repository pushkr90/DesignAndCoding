package FactoryPattern;

public class FactoryPattern {

    public static void main(String[] args)
    {
        carFactory CF=new carFactory();
        Vehicle v1= CF.getModel("BMW");
        v1.details();
        Vehicle v2=CF.getModel("Mercedes");
        v2.details();
        Vehicle v3=CF.getModel("AudiA3");
        v3.details();

    }

}

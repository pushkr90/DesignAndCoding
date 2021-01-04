package pacakge.com.OOD.Factory;

public abstract class Phone implements Product
{
    @Override
    public String print(int Ram,int Storage) {
        String res="";
        if(Ram==20 && Storage==10)
        {
            System.out.println("MX");
            res="MX";
        }
        else if(Ram==30 && Storage==20)
        {
            System.out.println("APPLE");
            res="apple";
        }

        return res;
    }

}

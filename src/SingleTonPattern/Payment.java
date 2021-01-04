package SingleTonPattern;

public class Payment {
    static int money;

    private static Payment pp=new Payment(money);
    private Payment(int money)
    {
        this.money=money;
    }
    public static Payment getInstacne()
    {
        return pp;
    }
    protected void deposit(int money)
    {
        System.out.println("Deposited"+money);
    }
}

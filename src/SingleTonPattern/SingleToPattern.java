package SingleTonPattern;

public class SingleToPattern {
    public static void main(String[] args) {
        Payment p1 = Payment.getInstacne();
        p1.deposit(1000);
    }
}

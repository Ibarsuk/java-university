package task28;

public class EPayment extends Payment{
    public EPayment() {
        this.paymentStrategy=new EPaymentStrategy();
    }
}

package task28;

public class CreditPayment extends Payment{
    public CreditPayment() {
        this.paymentStrategy=new CreditPaymentStrategy();
    }
}

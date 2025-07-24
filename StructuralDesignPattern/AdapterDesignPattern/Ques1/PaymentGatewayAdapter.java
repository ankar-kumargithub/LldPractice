package AdapterDesignPattern.Ques1;

public class PaymentGatewayAdapter implements PaymentGateway {

    private AdvancePaymentGateway advancePaymentGateway;

    PaymentGatewayAdapter(AdvancePaymentGateway advancePaymentGateway) {
        this.advancePaymentGateway = advancePaymentGateway;
    }

    @Override
    public void pay(int amount) {
        advancePaymentGateway.processTransaction(amount);
    }
}

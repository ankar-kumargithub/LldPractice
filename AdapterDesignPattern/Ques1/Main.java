package AdapterDesignPattern.Ques1;

public class Main {
    public static void main(String[] args) {
        PaymentGateway gateway = new PaymentGatewayAdapter(new AdvancePaymentGateway());
        gateway.pay(500);
    }
}

package Proxy;

public class Client {
    public static void main(String[] args){
        Payment payment=new PaymentProxy(200);
        payment.pay();
    }
}

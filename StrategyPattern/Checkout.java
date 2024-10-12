class Checkout {
    PaymentStrategy paymentStrategy;
    Checkout(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }   
    void processCheckout(){
        paymentStrategy.processPayment();
        System.out.println("Checkout process completed");
    }
}

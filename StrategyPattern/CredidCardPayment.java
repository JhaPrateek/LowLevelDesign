class CredidCardPayment implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Processing payemnt using "+PaymentType.CREDIT_CARD);
    }    
    
}

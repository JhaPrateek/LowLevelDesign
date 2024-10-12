class UPIPayment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Processing payment using "+PaymentType.UPI);
    }
}

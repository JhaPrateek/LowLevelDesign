class DebitCardPaymen implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Processing payment using "+PaymentType.DEBIT_CARD);
    }
    
}

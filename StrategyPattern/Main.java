public class Main{
    public static void main(String args[]){
        Checkout ch=new Checkout(new CredidCardPayment());
        ch.processCheckout();
    }
}
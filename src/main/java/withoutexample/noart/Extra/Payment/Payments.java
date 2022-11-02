package withoutexample.noart.Extra.Payment;

public enum Payments {
    CreditCardPaymentStrategy, PayPalPaymentStrategy, None;

    public static boolean getResponse(Payments payments){
//      Order is fine only if it's CreditCardPaymentStrategy :)
        return payments == CreditCardPaymentStrategy;
    }
}

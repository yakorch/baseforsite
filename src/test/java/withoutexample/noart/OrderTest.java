package withoutexample.noart;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import withoutexample.noart.Extra.Delivery.DeliveryAll;
import withoutexample.noart.Extra.Orders.Order;
import withoutexample.noart.Extra.Payment.Payments;

public class OrderTest {
    @Test
    public void orderTest(){
        Order order = new Order();
        Assertions.assertEquals(order.getPayment(), Payments.None);
        Assertions.assertEquals(order.getDeliveryAll(), DeliveryAll.None);
        Assertions.assertFalse(order.handle());

        order.setDeliveryAll(DeliveryAll.DHLDelivery);
        order.setPayment(Payments.CreditCardPaymentStrategy);

        Assertions.assertTrue(order.handle());

        order.setPayment(Payments.PayPalPaymentStrategy);
        Assertions.assertFalse(order.handle());
    }
}

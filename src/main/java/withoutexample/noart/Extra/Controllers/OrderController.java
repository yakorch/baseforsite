package withoutexample.noart.Extra.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import withoutexample.noart.Extra.Delivery.DeliveryAll;
import withoutexample.noart.Extra.Flowers.Flower;
import withoutexample.noart.Extra.Orders.Order;
import withoutexample.noart.Extra.Payment.Payments;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/order")
public class OrderController {
    @GetMapping
    public List<Flower> getFlowers() {
        Order order = new Order();
        List<Flower> example = order.getBaseOrder();
        order.setPayment(Payments.CreditCardPaymentStrategy);
        order.setDeliveryAll(DeliveryAll.PostDelivery);
        if (order.handle()) {
            return example;
        }
        System.out.println("Can't process the order");
        return List.of();
    }
}

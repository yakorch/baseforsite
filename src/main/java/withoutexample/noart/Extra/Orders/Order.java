package withoutexample.noart.Extra.Orders;

import lombok.Getter;
import lombok.Setter;
import withoutexample.noart.Extra.Decorators.Decorator;
import withoutexample.noart.Extra.Delivery.DeliveryAll;
import withoutexample.noart.Extra.Flowers.CactusFlower;
import withoutexample.noart.Extra.Flowers.Flower;
import withoutexample.noart.Extra.Flowers.RomashkaFlower;
import withoutexample.noart.Extra.Payment.Payments;

import java.util.List;
@Getter @Setter
public class Order {
    private Payments payment = Payments.None;
    private DeliveryAll deliveryAll = DeliveryAll.None;
    public List<Flower> getBaseOrder(){
        CactusFlower flowerOne = new CactusFlower();
        RomashkaFlower flowerTwo = new RomashkaFlower();
        RomashkaFlower flowerThree = new RomashkaFlower();
        flowerThree.setDecorator(Decorator.BASKET);
        flowerTwo.setDecorator(Decorator.RIBBON);
        flowerOne.setDecorator(Decorator.PAPER);
        return List.of(flowerOne, flowerTwo, flowerTwo);
    }
    public boolean handle(){
        return Payments.getResponse(payment) && DeliveryAll.handleDelivery(deliveryAll);
    }
}

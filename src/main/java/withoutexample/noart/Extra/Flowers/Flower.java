package withoutexample.noart.Extra.Flowers;

import lombok.*;
import withoutexample.noart.Extra.Decorators.Decorator;

@ToString
@Getter
@Setter
@AllArgsConstructor
@Data
public class Flower extends Item {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private Decorator decorator = Decorator.NONE;
    public Flower() {
    }

    public double getPrice() {
        return price + Decorator.getPrice(decorator);
    }
}

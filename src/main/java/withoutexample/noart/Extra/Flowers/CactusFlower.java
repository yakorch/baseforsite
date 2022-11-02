package withoutexample.noart.Extra.Flowers;

import java.util.Random;

public class CactusFlower extends Flower {
    private final int sepLength = 32;

    public CactusFlower() {
        setPrice(new Random().nextInt(1000));
        setSepalLength(sepLength);
        setColor(FlowerColor.GREEN);
        setDescription("The coolest present for a girlfriend!");
    }
}


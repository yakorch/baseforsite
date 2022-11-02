package withoutexample.noart.Extra.Flowers;

import withoutexample.noart.Extra.Flowers.Flower;
import withoutexample.noart.Extra.Flowers.FlowerColor;

import java.util.Random;

public class RomashkaFlower extends Flower {
    private final int sepLength = 15;

    public RomashkaFlower(){
        setPrice(new Random().nextInt(100));
        setSepalLength(sepLength);
        setColor(FlowerColor.WHITE);
        setDescription("Well it's better than nothing!");

    }
}

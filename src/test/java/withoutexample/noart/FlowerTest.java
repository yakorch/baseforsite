package withoutexample.noart;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import withoutexample.noart.Extra.Decorators.Decorator;
import withoutexample.noart.Extra.Flowers.CactusFlower;
import withoutexample.noart.Extra.Flowers.FlowerColor;
import withoutexample.noart.Extra.Flowers.RomashkaFlower;


public class FlowerTest {
    @Test
    public void testCactus(){
        CactusFlower cactusFlower = new CactusFlower();
        String testString = "WOW";
        cactusFlower.setDescription(testString);
        Assertions.assertEquals(cactusFlower.getDescription(), testString);
        Assertions.assertTrue(cactusFlower.getPrice() <= 1000);
        Assertions.assertSame(cactusFlower.getColor(), FlowerColor.GREEN);
        Assertions.assertSame(cactusFlower.getDecorator(), Decorator.NONE);
        double oldPrice  = cactusFlower.getPrice();
        cactusFlower.setDecorator(Decorator.PAPER);
        Assertions.assertEquals(oldPrice + Decorator.getPrice(Decorator.PAPER), cactusFlower.getPrice());
    }

    @Test
    public void testRomashka(){
        RomashkaFlower romashkaFlower = new RomashkaFlower();
        String testString = "WOW";
        romashkaFlower.setDescription(testString);
        Assertions.assertEquals(romashkaFlower.getDescription(), testString);
        Assertions.assertTrue(romashkaFlower.getPrice() <= 100);
        Assertions.assertSame(romashkaFlower.getColor(), FlowerColor.WHITE);
        Assertions.assertSame(romashkaFlower.getDecorator(), Decorator.NONE);
        double oldPrice  = romashkaFlower.getPrice();
        romashkaFlower.setDecorator(Decorator.BASKET);
        Assertions.assertEquals(oldPrice + Decorator.getPrice(Decorator.BASKET), romashkaFlower.getPrice());
    }
}

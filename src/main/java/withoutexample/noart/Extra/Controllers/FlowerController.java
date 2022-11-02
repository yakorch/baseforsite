package withoutexample.noart.Extra.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import withoutexample.noart.Extra.Flowers.CactusFlower;
import withoutexample.noart.Extra.Flowers.Flower;
import withoutexample.noart.Extra.Flowers.RomashkaFlower;

import java.util.List;

@RestController
public class FlowerController {

    @GetMapping
    public List<Flower> hello() {
        return List.of(new RomashkaFlower(), new CactusFlower());
    }
}

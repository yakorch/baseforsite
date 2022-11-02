package withoutexample.noart.Extra.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import withoutexample.noart.Extra.Flowers.CactusFlower;
import withoutexample.noart.Extra.Flowers.FlowerBucket;
import withoutexample.noart.Extra.Flowers.RomashkaFlower;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/bucket")
public class FlowerBucketController {
    @GetMapping
    public List<FlowerBucket> getFlowers() {
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.add(new RomashkaFlower());
        flowerBucket.add(new CactusFlower());
        return List.of(flowerBucket);
    }
}

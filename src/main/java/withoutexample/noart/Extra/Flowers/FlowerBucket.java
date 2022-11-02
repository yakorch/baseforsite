package withoutexample.noart.Extra.Flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class FlowerBucket {
    private List<Flower> flowerList = new ArrayList<>();

    public void add(Flower flower) {
        flowerList.add(flower);
    }

    public void remove(Flower flower) {
        flowerList.remove(flower);
    }

    public double calcTotalPrice(){
        int res = 0;
        for (Flower fl:flowerList
             ) {
            res += fl.getPrice();
        }
        return res;
    }
}

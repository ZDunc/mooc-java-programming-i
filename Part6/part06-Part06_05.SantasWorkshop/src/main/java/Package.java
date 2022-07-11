import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;


    public Package() {
        gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        int ttlWeight = 0;
        for (Gift g: gifts) {
            ttlWeight += g.getWeight();
        }
       
        return ttlWeight;
    }
}

import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
    }

    public int totalWeight() {
        int ttl = 0;
        for (Item i: items) {
            ttl += i.getWeight();
        }

        return ttl;
    }

    public void addItem(Item item) {
        if ((this.totalWeight() + item.getWeight()) > maxWeight)
            return;
        else
            items.add(item);
    }

    @Override
    public String toString() {
        String s = "";

        // Add num of items to string
        if(items.size() == 0)
            s += "no ";
        else
            s += items.size();
        s += " item";

        if (items.size() != 1)
            s += "s";

        return s + " (" + totalWeight() + " kg)";
    }

    public void printItems() {
        for (Item i: items) {
            System.out.println(i);
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty())
            return null;

        Item heaviest = items.get(0);

        for (Item i: items) {
            if (i.getWeight() > heaviest.getWeight())
                heaviest = i;
        }

        return heaviest;
    }
}

import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<>();
    }

    public int totalWeight() {
        int ttl = 0;
        for (Suitcase s: suitcases) {
            ttl += s.totalWeight();
        }
    
        return ttl;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if ((this.totalWeight() + suitcase.totalWeight()) > this.maxWeight)
            return;
        else
            this.suitcases.add(suitcase);
    }

    @Override
    public String toString() {
        String s = "";

        // Add num of items to string
        if(suitcases.size() == 0)
            s += "no ";
        else
            s += suitcases.size() + " ";
        s += "suitcase";

        if (suitcases.size() != 1)
            s += "s";

        return s + " (" + totalWeight() + " kg)";
    }

    public void printItems() {
        for (Suitcase s: suitcases)
            s.printItems();
    }
}





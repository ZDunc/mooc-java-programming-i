public class Container {
    private int liters;

    public Container() {
        liters = 0;
    }

    public int contains() {
        return liters;
    }

    public void add(int amount) {
        if (amount < 0)
            return;
        else if (amount + liters > 100)
            liters = 100;
        else
            liters += amount;
    }

    public void remove(int amount) {
        if (amount < 0)
            return;
        else if (liters - amount < 0)
            liters = 0;
        else
            liters -= amount;
    }

    @Override
    public String toString() {
        return liters + "/100";
    }
}

public class Item {
    private String name;
    private int weight; // in kg

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        String output = name.substring(0, 1).toUpperCase() + name.substring(1);
        return output + " (" + weight + " kg)";
    }
}

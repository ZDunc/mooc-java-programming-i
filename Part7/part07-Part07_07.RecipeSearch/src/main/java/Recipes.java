import java.util.ArrayList;
public class Recipes {
    private String name;
    private int time;
    private ArrayList <String>ingr =new ArrayList<>();
    
    public Recipes(){
        
    }

    public Recipes(String name,int time, ArrayList ingr) {
        this.name = name;
        this.time=time;
        this.ingr= ingr;
    }
    
    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.time;
    }
    
    public ArrayList<String> getIngr() {
        return this.ingr;
    }
    
    public String toString() {
        return this.name+", cooking time: " +this.time;
    }
}
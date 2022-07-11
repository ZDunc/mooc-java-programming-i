import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class RecipesList {

    private Scanner scan;
    private ArrayList<Recipes> recipeList;
    private Recipes recipe;
    private ArrayList<String> lettura;

    public RecipesList() {
        recipeList = new ArrayList<>();
        lettura = new ArrayList<>();
        recipe = new Recipes();

    }

    public void reading(String nomeFile) {

        try (Scanner letFile = new Scanner(Paths.get(nomeFile))) {
            while (letFile.hasNextLine()) {
                lettura.add(letFile.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        ArrayList<String> ricette = new ArrayList<>();
        ArrayList ingred = new ArrayList<>();
        int i = 0;

        while (true) {
            ricette.clear();

            if (i + 1 == lettura.size()) {
                break;
            }
            while (true) {
                if (i + 1 == lettura.size()) {
                    break;
                }else if (lettura.get(i).isEmpty()) {
                    i++;
                    break;
                } 
                ricette.add(lettura.get(i));
                i++;
            }
            ingred.clear();
            for (int y = 2; y < ricette.size(); y++) {
                ingred.add(ricette.get(y));
            }
            ArrayList ingr = new ArrayList<>();
            for (int n = 0; n < ingred.size(); n++) {
                ingr.add(ingred.get(n));
            }
            recipe = new Recipes(ricette.get(0), Integer.valueOf(ricette.get(1)), ingr);
            recipeList.add(recipe);
        }
    }

    public void printList() {
        for (int k = 0; k < recipeList.size(); k++) {
            System.out.println(recipeList.get(k));
        }
    }

    public void searchName(String recName) {

        for (int i = 0; i < recipeList.size(); i++) {
            if (recipeList.get(i).getName().contains(recName)) {
                System.out.println(recipeList.get(i));
            }
        }
    }

    public void searchTime(int time) {
        for (int i = 0; i < recipeList.size(); i++) {
            if (recipeList.get(i).getTime() <= time) {
                System.out.println(recipeList.get(i));
            }
        }
    }

    public void searchIngr(String ingrediente) {

        for (int i = 0; i < recipeList.size(); i++) {
            if (recipeList.get(i).getIngr().contains(ingrediente)) {
                System.out.println(recipeList.get(i));
            }
        }
    }
}
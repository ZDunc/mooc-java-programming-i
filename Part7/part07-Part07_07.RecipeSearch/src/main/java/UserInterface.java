import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    RecipesList recipesList = new RecipesList();

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.print("File to read: ");
        String nome = scanner.nextLine();
        System.out.println("");
        recipesList.reading(nome);
        System.out.println("Commands: ");
        System.out.println("list - list the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        while (true) {
            System.out.print("Enter command: ");
            String word = scanner.nextLine();
            if (word.equals("stop")) {
                break;
            }
            else if (word.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                recipesList.printList();
                System.out.println("");
            }
            else if(word.equals("find name")) {
                System.out.print("Searched word:");
                String recNome = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                recipesList.searchName(recNome); 
                System.out.println("");
            }
            else if (word.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int timeMax= Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                recipesList.searchTime(timeMax);
                System.out.println("");
            }
            else if (word.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingr= scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                recipesList.searchIngr(ingr);
                System.out.println("");
            }
        }
    }
}
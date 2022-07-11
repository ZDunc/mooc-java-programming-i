import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.dict = dict;
        this.scanner = scanner;
    }

    public void start() {
        while(true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end") || command.equals("End") || command.equals("END")) {
                System.out.println("Bye bye!");
                break;
            }
            else if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();

                System.out.println("Translation: ");
                String trans = scanner.nextLine();

                dict.add(word, trans);
            } else if (command.equals("search")) {
                System.out.println("To be translated: ");
                String word = scanner.nextLine();

                String translatedWord = dict.translate(word);
                if (translatedWord == null)
                    System.out.println("Word " + word + " was not found");
                else
                    System.out.println(translatedWord);
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}

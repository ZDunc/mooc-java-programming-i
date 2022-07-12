
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean bool = true;
        while (bool == true) {
            System.out.println("Shall we carry on?");
            String input = scanner.nextLine();
            
            if (input.equals("no")) {
                bool = false;
            }
        }
    }
}

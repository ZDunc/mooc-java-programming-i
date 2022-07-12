
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String oldestName = "";
        while(true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            String[] pieces = input.split(",");
            int age = Integer.valueOf(pieces[1]);
            
            if (age > oldest) {
                oldest = age;
                oldestName = pieces[0];
            }
                
        }
        
        System.out.println("Age of the oldest: " + oldestName);
    }
}

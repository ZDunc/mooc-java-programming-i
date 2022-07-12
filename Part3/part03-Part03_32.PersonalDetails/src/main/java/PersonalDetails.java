
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int yearSum = 0;
        String longestName = "";
        while(true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            String[] pieces = input.split(",");
            int birthYear = Integer.valueOf(pieces[1]);
            
            if (pieces[0].length() > longestName.length()) {
                longestName = pieces[0];
            }
            
            yearSum += birthYear;
            counter++;
        }
        
        double yearAvg = (1.0 * yearSum) / counter;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + yearAvg);

    }
}

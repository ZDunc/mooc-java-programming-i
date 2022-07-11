
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int counter = 0;
        try (Scanner fileScan = new Scanner(Paths.get(file))) {

            // we read all the lines of the file
            while (fileScan.hasNextLine()) {
                int num = Integer.valueOf(fileScan.nextLine());
                if (num <= upperBound && num >= lowerBound)
                    counter++;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Numbers: " + counter);
        
        scanner.close();
    }

}

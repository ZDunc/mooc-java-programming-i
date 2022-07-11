
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String file = scanner.nextLine();

        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while(fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}

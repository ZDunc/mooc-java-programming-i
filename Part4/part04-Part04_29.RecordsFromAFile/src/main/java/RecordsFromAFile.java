
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner fileScan = new Scanner(Paths.get(file))) {

            // we read all the lines of the file
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();

                if (line.isEmpty())
                    continue;

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                System.out.print(name + ", age: " + age + " year");
                if (age == 1)
                    System.out.print("\n");
                else
                    System.out.print("s\n");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Read person information from the user
        while (true) {
            //System.out.print("First name: ");
            String name = scanner.nextLine();
            if (name.isEmpty())
                break;

            //System.out.print("Last name: ");
            int duration = Integer.valueOf(scanner.nextLine());
    
            programs.add(new TelevisionProgram(name, duration));
        }   

        System.out.println("Program's maximum duration? ");
        int max = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram tv: programs) {
            if (tv.getDuration() <= max)
                System.out.println(tv);
        }

        scanner.close();
    }
}

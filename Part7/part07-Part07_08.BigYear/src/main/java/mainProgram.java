import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);

        ArrayList<Bird> birds = new ArrayList<>();

        while(true) {
            System.out.print("? "); // Initial entry
            String entry = scan.nextLine();

            if (entry.equals("Quit")) {
                break;
            } else if (entry.equals("Add")) {
                System.out.print("Name "); 
                String name = scan.nextLine();
                System.out.print("Name in Latin "); 
                String latin = scan.nextLine();

                birds.add(new Bird(name, latin));
            } else if (entry.equals("Observation")) {
                System.out.print("Bird "); 
                String ob = scan.nextLine();
                boolean onList = false;

                for (Bird b: birds) {
                    if (b.getName().equals(ob)) {
                        b.incrementObservations();
                        onList = true;
                    }     
                }

                if (onList == false)
                    System.out.println("Not a bird!");

            } else if (entry.equals("All")) {
                for (Bird b: birds) {
                    System.out.println(b);
                }
            } else if (entry.equals("One")) {
                System.out.print("Bird "); 
                String bird = scan.nextLine();

                for (Bird b: birds) {
                    if (b.getName().equals(bird)) {
                        System.out.println(b);
                        break;
                    }     
                }
            }
        }

    }

}

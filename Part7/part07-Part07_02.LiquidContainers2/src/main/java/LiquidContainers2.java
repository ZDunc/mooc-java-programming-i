
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
    
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            String[] pieces = input.split(" ");

            if (input.equals("quit")) {
                
                break;
            } else if (pieces[0].equals("add")) {

                first.add(Integer.valueOf(pieces[1]));
            } else if (pieces[0].equals("move")) {

                int transfer = Integer.valueOf(pieces[1]);
                if (transfer > first.contains())
                    transfer = first.contains();
                first.remove(transfer);
                second.add(transfer);
            } else if (pieces[0].equals("remove")) {

                second.remove(Integer.valueOf(pieces[1]));
            } else {

                System.out.println("Invalid command");
            }
        }

        scan.close();
    }

}

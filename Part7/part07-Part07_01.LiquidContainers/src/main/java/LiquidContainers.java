import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // initialize containers
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            String[] pieces = input.split(" ");

            if (pieces[0].equals("quit")) {
                break;
            } else if (pieces[0].equals("add")) {
                int add = Integer.valueOf(pieces[1]);
                if (add < 0)
                    continue;

                if (first + add < 100) {
                    first += add;
                }
                else
                    first = 100;
            } else if (pieces[0].equals("move")) {
                int transfer = 0;
                if (Integer.valueOf(pieces[1]) > first)
                    transfer = first;
                else
                    transfer = Integer.valueOf(pieces[1]);

                if (second + transfer < 100)
                    second += transfer;
                else
                    second = 100;

                first -= transfer;
            } else if (pieces[0].equals("remove")) {
                int remove = 0;
                if (Integer.valueOf(pieces[1]) > second)
                    remove = second;
                else
                    remove = Integer.valueOf(pieces[1]);

                second -= remove;
            } else {
                System.out.println("Invalid command");
            }



        }
    }

}

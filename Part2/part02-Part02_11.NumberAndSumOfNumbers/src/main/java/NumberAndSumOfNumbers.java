
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The task is to keep track of number ones
        int sum = 0;
        int counter = 0;

        // The task is to read an input from the user
        while (true) {
            System.out.println("Give a number:");
            // The task is to read a user inputted number
            int number = Integer.valueOf(scanner.nextLine());

            // The task is to exit the loop if the user
            // has inputted zero
            if (number == 0) {
                break;
            } 
            sum += number;
            counter++;
        }
        // The task is to print out the total of ones
        System.out.println("Number of numbers: " + counter);
        System.out.println("Sum of the numbers: " + sum);
    }
}

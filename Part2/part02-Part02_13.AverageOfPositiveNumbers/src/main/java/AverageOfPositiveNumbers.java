
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The task is to keep track of number ones
        int sum = 0;
        int counter = 0;

        // The task is to read an input from the user
        while (true) {
            // The task is to read a user inputted number
            int number = Integer.valueOf(scanner.nextLine());

            // The task is to exit the loop if the user
            // has inputted zero
            if (number == 0) {
                break;
            } else if (number < 0) {
                continue;
            } else {
                sum += number;
                counter++;
            }
        }
        // The task is to print out the total of ones
        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) sum / counter;
            System.out.println("Average of the numbers: " + average);
        }    
    }
}

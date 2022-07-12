
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int evenCounter = 0;
        int oddCounter = 0;
        
        System.out.println("Give numbers:");
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == -1) {
                break;
            } else if (num % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
            
            sum += num;
            counter++;
        }
        
        double avg = (double) sum / counter;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + evenCounter);
        System.out.println("Odd: " + oddCounter);
    }
}

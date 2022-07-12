
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myInt = Integer.valueOf(scanner.nextLine());
        myInt*= myInt;
        
        System.out.println(myInt);
    }
}

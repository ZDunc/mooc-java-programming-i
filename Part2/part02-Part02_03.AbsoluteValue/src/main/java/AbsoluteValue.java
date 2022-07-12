
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int myInt = Integer.valueOf(scanner.nextLine());
        
        if (myInt < 0) {
            myInt*= -1;
        }
        
        System.out.println(myInt);

    }
}

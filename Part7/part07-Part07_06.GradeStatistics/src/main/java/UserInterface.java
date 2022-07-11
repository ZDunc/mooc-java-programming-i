import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Class myClass;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        myClass = new Class();
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        while(true) {
            int grade = Integer.valueOf(scanner.nextLine());

            if (grade == -1)
                break;

            if (grade < 0 || grade > 100)
                continue;
            
            myClass.addGrade(grade);
        }

        printClassStatistics();
    }

    public void printClassStatistics() {
        System.out.println("Point average (all): " + myClass.getAverage());
        System.out.println("Point average (passing): " + myClass.getPassingAverage());
        System.out.println("Pass percentage: " + myClass.getPassPercentage());
        System.out.println("Grade distribution:");
        myClass.printDistribution();
    }
}

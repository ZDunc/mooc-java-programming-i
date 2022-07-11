import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> myList = new ArrayList<>();

        // Read person information from the user
        while (true) {
            //System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty())
                break;

            //System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            //System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
    
            myList.add(new Book(title, pages, year));
        }   

        System.out.println("What information will be printed? ");
        String toPrint = scanner.nextLine();

        if (toPrint.equals("everything")) {
            for (Book currentBook: myList) {
                System.out.println(currentBook);
            }
        } else {
            for (Book currentBook: myList) {
                System.out.println(currentBook.getTitle());
            }
        }

        scanner.close();
    }
}

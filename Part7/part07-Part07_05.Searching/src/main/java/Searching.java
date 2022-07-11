import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId)
                return i;
        }
        
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        //int middle = books.size() / 2;

        //ArrayList<Book> crawl_list1 = new ArrayList<Book>(books.subList(0, middle - 1));
        //ArrayList<Book> crawl_list2 = new ArrayList<Book>(books.subList(middle + 1, books.size()));
        // Split array in half
        //ArrayList<Book> first = new ArrayList<Book>();
        //ArrayList<Book> second = new ArrayList<>();

        //for (int i = size)
        //List[] halfList = split(books);

        /*if (books.get(middle).getId() == searchedId) {
            return middle;
        } else if (books.get(middle).getId() > searchedId) {
             return binarySearch(crawl_list1, searchedId);
        } else if (books.get(middle).getId() < searchedId) {
             return binarySearch(crawl_list2, searchedId);
        } else {
            return -1;
        }*/

        int low = 0; // 0th index of list
        int high = books.size() - 1;

        while (low <= high) {
            int middle = low + ((high - low) / 2);

            if (books.get(middle).getId() == searchedId) {
                return middle;
            } else if (books.get(middle).getId() < searchedId) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return -1;
    }
}


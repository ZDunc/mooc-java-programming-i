
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print('*');
        }
        System.out.print('\n');
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(' ');
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        int row = 0;
        for (int i = 1; i <= height; i++, row++) {
            printSpaces(height - i);
            printStars(i + row);
        }
        
        for (int j = 0; j < 2; j++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

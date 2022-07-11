import java.util.Scanner;

public class UserInterface {
    private TodoList todo;
    private Scanner scanner;

    public UserInterface(TodoList todo, Scanner scanner) {
        this.todo = todo;
        this.scanner = scanner;
    }

    public void start() {
        while(true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }
            else if (command.equals("add")) {
                System.out.println("To add: ");
                String task = scanner.nextLine();

                todo.add(task);
            } else if (command.equals("list")) {
                todo.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int number = Integer.valueOf(scanner.nextLine());
                todo.remove(number);
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}

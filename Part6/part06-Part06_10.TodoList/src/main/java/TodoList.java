import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todo;

    public TodoList() {
        todo = new ArrayList<>();
    }

    public void add(String task) {
        todo.add(task);
    }

    public void print() {
        int counter = 1;

        for (String s: todo) {
            System.out.println(counter + ": " + s);
            counter++;
        }
    }

    public void remove(int number) {
        todo.remove(todo.get(number - 1));
    }
}



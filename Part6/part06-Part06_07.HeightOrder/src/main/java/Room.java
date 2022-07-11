import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        if (persons.isEmpty())
            return true;
        else
            return false;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if (this.isEmpty())
            return null;

        Person shortest = persons.get(0);

        for (Person p: persons) {
            if (p.getHeight() < shortest.getHeight())
                shortest = p;
        }

        return shortest;
    }

    public Person take() {
        Person p = this.shortest();
        persons.remove(p);

        return p;
    }
}

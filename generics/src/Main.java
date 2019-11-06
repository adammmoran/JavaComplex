import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Person<Integer, String> person1 = new Person<>(1, "vasya");
        Person<String, String> person2 = new Person<>("2", "petya");
        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        System.out.println(people);

        List<? extends Number> numbers = new ArrayList<>();
        File file = new File(System.getProperty("user.home") + File.separator + "test.txt");
        Saver saver = new Saver();
        saver.save(file, new Person<String, String>("123", "oleh"));
    }
}

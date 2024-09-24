package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PERSON_COUNT;
    private List<Person> users;

    {
        users = new ArrayList<>();

        users.add(new Person(++PERSON_COUNT, "Name1", "surName1", 2001));
        users.add(new Person(++PERSON_COUNT, "Name2", "surName2", 2002));
        users.add(new Person(++PERSON_COUNT, "Name3", "surName3", 2003));
        users.add(new Person(++PERSON_COUNT, "Name4", "surName4", 2004));
        users.add(new Person(++PERSON_COUNT, "Name5", "surName5", 2005));
    }

    public List<Person> index() {
        return users;
    }

    public Person show(int id) {
        return users.stream().filter(users -> users.getId() == id)
                .findAny().orElse(null);
    }
public void save(Person person){
        person.setId(++PERSON_COUNT);
        users.add(person);
}
}

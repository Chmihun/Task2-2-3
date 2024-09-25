package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PERSON_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PERSON_COUNT, "Name1", "surName1", 2001));
        people.add(new Person(++PERSON_COUNT, "Name2", "surName2", 2002));
        people.add(new Person(++PERSON_COUNT, "Name3", "surName3", 2003));
        people.add(new Person(++PERSON_COUNT, "Name4", "surName4", 2004));
        people.add(new Person(++PERSON_COUNT, "Name5", "surName5", 2005));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(users -> users.getId() == id)
                .findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PERSON_COUNT);
        people.add(person);
    }

    public void update(int id, Person updatePerson) {
        Person personToBiUpdated = show(id);
        personToBiUpdated.setName(updatePerson.getName());
    }
public void delete(int id){
    System.out.println("iiiiiiiiiiiii");
    people.removeIf(p->p.getId()==id);
    }
}


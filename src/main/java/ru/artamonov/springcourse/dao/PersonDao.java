package ru.artamonov.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.artamonov.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDao {
    private final List<Person> people = new ArrayList<>();
    private static int AUTO_INCREMENT;
    {
        people.add(new Person(++AUTO_INCREMENT, "tobi"));
        people.add(new Person(++AUTO_INCREMENT, "pizda"));
        people.add(new Person(++AUTO_INCREMENT, "tekai"));
        people.add(new Person(++AUTO_INCREMENT, "s uchilisha"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}

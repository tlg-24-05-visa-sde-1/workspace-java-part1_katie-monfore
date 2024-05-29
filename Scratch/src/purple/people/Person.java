package purple.people;

import java.time.LocalDate;
import java.time.Period;

/*
 * Immutable class. More accurately this is a class definition written in such a way that instances of it,
 * once created, cannot have their properties changed.
 * There are simply no public methods available to do this
 */
public class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int age() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public String name() {
        return name;
    }

    public LocalDate birthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("Person: name=%s, Birth Date=%s", name(), birthDate());
    }
}

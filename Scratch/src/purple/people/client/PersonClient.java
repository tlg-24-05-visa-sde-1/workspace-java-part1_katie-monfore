package purple.people.client;

import purple.people.Person;
import purple.people.PersonRecord;

import java.time.LocalDate;
class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Katie", LocalDate.of(1988, 11, 20));

        System.out.printf("%s is %s years old\n", p1.name(), p1.age());
        System.out.println(p1);
        System.out.println();

        PersonRecord p2 = new PersonRecord("Hutch", LocalDate.of(2010, 01, 9));
        System.out.printf("%s is %s years old\n", p2.name(), p2.age());
    }
}

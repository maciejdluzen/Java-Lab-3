package Exercise1;

public class PersonTable {

    public static void main(String[] args) {

        Person[] person = new Person[5];
        person[0] = new Person("Adamski", "Adam");
        person[1] = new Person("Kowalski", "Jan");
        person[2] = new Person("Kot", "Maciej");
        person[3] = new Person("Kubacki", "Dawid");
        person[4] = new Person("Stoch", "Kamil");

        List persons = new PersonList(person);

        Table personsTable = new Table(persons);

        System.out.println(personsTable);
    }
}

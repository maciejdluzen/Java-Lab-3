package Exercise1;

public class PersonList implements List{

    private Person[] persons;

    public PersonList(Person[] persons) {
        this.persons = persons;
    }

    @Override
    public String title() {
        return "Persons List";
    }

    @Override
    public String header() {
        return "No. LastName        FirstName";
    }

    @Override
    public String[] rows() {
        String[] rows = new String[persons.length];

        for(int i=0; i<persons.length; i++) {
            rows[i] = String.format("%3d %-31s", (i+1), persons[i]);

        }
        return rows;
    }
}

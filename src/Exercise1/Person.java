package Exercise1;

public class Person {

    private String lastName, firstName;

    public Person(String lastName, String firstName) {
        this.firstName = new String(firstName);
        this.lastName = new String(lastName);
    }

    public String toString() {
        return String.format("%-15s %-15s", lastName, firstName);
    }




}

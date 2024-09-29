package adapterpattern;

public class SchoolStudent {
    private String firstName;
    private String surname;
    private String age;

    public SchoolStudent(String firstName, String lastName, String age) {
        this.firstName = firstName;
        this.surname = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getAge() {
        return this.age;
    }
}

package adapterpattern;

public class CollegeStudent implements Student {
    private String firstName;
    private String lastName;
    private String age;

    public CollegeStudent(String firstName, String lastName, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getAge() {
        return this.age;
    }
}

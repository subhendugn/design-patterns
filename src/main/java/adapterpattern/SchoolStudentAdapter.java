package adapterpattern;

public class SchoolStudentAdapter implements Student {
    private SchoolStudent schoolStudent;

    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String getFirstName() {
        return this.schoolStudent.getFirstName();
    }

    @Override
    public String getLastName() {
        return this.schoolStudent.getSurname();
    }

    @Override
    public String getAge() {
        return this.schoolStudent.getAge();
    }
}

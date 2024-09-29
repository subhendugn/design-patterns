package adapterpattern;

public class Demo {
    public static void main(String[] args) {
        StudentClient studentClient = new StudentClient();
        studentClient.getStudents().forEach(
                student -> System.out.println("First Name: " + student.getFirstName() + ", Last Name: " + student.getLastName() + ", Age: " + student.getAge())
        );
    }
}

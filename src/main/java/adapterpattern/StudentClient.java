package adapterpattern;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        CollegeStudent collegeStudent = new CollegeStudent("John", "Doe", "20");
        students.add(collegeStudent);


        SchoolStudent schoolStudent = new SchoolStudent("Jane", "Doe", "15");

        //students.add(schoolStudent);
        // The above line will not work because the SchoolStudent class does not implement the Student interface.
        // We can use the SchoolStudentAdapter class to adapt the SchoolStudent class to the Student interface.
        // The SchoolStudentAdapter class will have a reference to the SchoolStudent object and will implement the Student interface.
        // The SchoolStudentAdapter class will delegate the calls to the SchoolStudent object.
        // The SchoolStudentAdapter class will be used to adapt the SchoolStudent object to the Student interface.
        students.add(new SchoolStudentAdapter(schoolStudent));

        return students;
    }



}

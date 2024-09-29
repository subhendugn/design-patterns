package factorypattern;

public class CourseFactory {
    public Course getCourse(String courseType) {
        if (courseType == null) {
            return null;
        }
        if (courseType.equalsIgnoreCase("HLD")) {
            return new HLDCourse();
        } else if (courseType.equalsIgnoreCase("LLD")) {
            return new LLDCourse();
        }
        return null;
    }
}

package abstractfactory;


public abstract class AbstractCourseFactory {
    private static int cutoffMarks = 100;

    public static AbstractCourseFactory getCourseFactory(int marks) {
        if (marks > cutoffMarks) {
            return new TopUnivercity();
        } else {
            return new LowUnivercity();
        }
    }

    public abstract Fees getFees(String courseType);
    public abstract AdmitCard getAdmitCard(String courseType);
}

package abstractfactory;

public class Demo {

    public static void main(String[] args) {
        AbstractCourseFactory courseFactory = AbstractCourseFactory.getCourseFactory(101);
        courseFactory.getCourseFactory(101).getFees("B.Tech");
        courseFactory.getCourseFactory(99).getAdmitCard("MBA");
        courseFactory.getCourseFactory(101).getFees("M.Tech");
        courseFactory.getCourseFactory(101).getAdmitCard("Test");

        System.out.println( courseFactory.getCourseFactory(101).getFees("B.Tech"));
    }
}

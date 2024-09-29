package factorypattern;

public class Demo {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
//        courseFactory.getCourse("HLD").createCourse();
//        courseFactory.getCourse("LLD").createCourse();

        System.out.println("HLD Course Modules:");
        courseFactory.getCourse("HLD").getModules().forEach(module -> System.out.println(module));

        courseFactory.getCourse("LLD").getModules().forEach(module -> System.out.println(module));
    }
}

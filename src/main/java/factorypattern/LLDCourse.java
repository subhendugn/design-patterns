package factorypattern;

public class LLDCourse extends Course {
    @Override
    public void createCourse() {
        modules.add(new DesignPatternModule());
    }
}

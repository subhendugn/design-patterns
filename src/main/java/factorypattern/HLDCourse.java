package factorypattern;

public class HLDCourse extends Course {
    @Override
    public void createCourse() {
        modules.add(new IntroModule());
        modules.add(new DesignPatternModule());
    }
}

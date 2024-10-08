package factorypattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {
    List<Module> modules = new ArrayList<>();

    public Course() { this.createCourse(); }

    public List<Module> getModules() {
        return modules;
    }

    public abstract void createCourse();

}

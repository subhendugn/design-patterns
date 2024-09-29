package factorypattern;

public class DesignPatternModule extends Module {
    private String moduleName;
    private String moduleDescription;

    public DesignPatternModule() {
        this.setModuleName("Introduction to Design Patterns");
        this.setModuleDescription("This module will introduce you to the Java programming language.");
    }

    private void setModuleDescription(String s) {
        this.moduleDescription = s;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
}

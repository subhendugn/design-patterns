package factorypattern;

public class IntroModule extends Module {
    private String moduleName;
    private String moduleDescription;

    public IntroModule() {
        this.setModuleName("Introduction to Java");
        this.setModuleDescription("This module will introduce you to the Java programming language.");
    }

    private void setModuleDescription(String s) {
        this.moduleDescription = s;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
}

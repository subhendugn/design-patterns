package strategypattern;

public class TataCar {
    private IDisplay display;

    public TataCar(IDisplay display) {
        this.display = display;
    }

    public void display() {
        display.display();
    }
}

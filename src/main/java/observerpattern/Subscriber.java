package observerpattern;

public class Subscriber implements ISubscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void update(String message, String channelName) {
        System.out.println("Subscriber " + this.name + " received message: " + message + " from channel " + channelName);
    }


}

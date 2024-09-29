package observerpattern;

public interface ISubscriber {
    void update(String message, String channelName);
}

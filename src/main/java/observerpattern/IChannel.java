package observerpattern;

public interface IChannel {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers(String message);
    void upload(String video);
    void countSubscribers();
}

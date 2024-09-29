package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements IChannel {
    private String channelName;
    private int subscribersCount = 0;
    private List<ISubscriber> subscribers = new ArrayList<>();


    public Channel(String channelName) {
        this.channelName = channelName;
    }

    public void subscribe(Subscriber subscriber) {
        this.subscribersCount++;
        this.subscribers.add(subscriber);
        System.out.println("Subscriber " + subscriber.getName() + " subscribed to channel " + this.channelName);
    }

    public void unsubscribe(Subscriber subscriber) {
        this.subscribersCount--;
        this.subscribers.remove(subscriber);
        System.out.println("Subscriber " + subscriber.getName() + " unsubscribed from channel " + this.channelName);
    }

    @Override
    public void notifySubscribers(String message) {
        subscribers.forEach(subscriber -> subscriber.update(message, this.channelName));
    }

    public void upload(String video) {
        System.out.println("Video uploaded: " + video);
        notifySubscribers(video);
    }

    @Override
    public void countSubscribers() {
        System.out.println("Channel " + this.channelName + " has " + this.subscribersCount + " subscribers");
    }


}

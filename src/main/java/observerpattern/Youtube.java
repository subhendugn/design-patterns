package observerpattern;

public class Youtube {
    public static void main(String[] args) {
        Channel channel = new Channel("Informatica");
        Subscriber subscriber1 = new Subscriber("Alice");
        Subscriber subscriber2 = new Subscriber("Bob");
        Subscriber subscriber3 = new Subscriber("Charlie");

        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);
        channel.subscribe(subscriber3);

        channel.countSubscribers();

        channel.upload("New video uploaded");

        channel.unsubscribe(subscriber2);

        channel.countSubscribers();

        channel.upload("Another video uploaded");

        Channel channel2 = new Channel("Math");
        Subscriber subscriber4 = new Subscriber("David");
        Subscriber subscriber5 = new Subscriber("Eve");

        channel2.subscribe(subscriber4);
        channel2.subscribe(subscriber5);

        channel2.countSubscribers();

        channel2.upload("New video uploaded");

        channel2.unsubscribe(subscriber5);

        channel2.countSubscribers();

        channel2.upload("Another video uploaded");
    }
}

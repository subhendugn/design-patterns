package decoratorpattern;

public class Mushroom extends ToppingsDecorator {
    BasePizza pizza;

    public Mushroom(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int price() {
        return pizza.price() + 40;
    }
}

package decoratorpattern;

public class ExtraCheese extends ToppingsDecorator {
    BasePizza pizza;

    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int price() {
        return pizza.price() + 50;
    }
}

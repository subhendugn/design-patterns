package decoratorpattern;

public class FarmhousePizza extends BasePizza {
    @Override
    public int price() {
        return 200;
    }
}

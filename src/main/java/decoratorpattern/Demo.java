package decoratorpattern;

public class Demo {
    public static void main(String[] args) {
        // Create a farmhouse pizza base pizza
        BasePizza farmhousePizza = new FarmhousePizza();
        System.out.println("Price of farmhouse pizza: " + farmhousePizza.price());

        // Add extra cheese to the farmhouse pizza decorator
        // The price of farmhouse pizza with extra cheese is 200 + 50 = 250
        BasePizza farmhousePizzaWithExtraCheese = new ExtraCheese(farmhousePizza);
        System.out.println("Price of farmhouse pizza with extra cheese: " + farmhousePizzaWithExtraCheese.price());

        // Add mushroom to the farmhouse pizza decorator
        // The price of farmhouse pizza with extra cheese and mushroom is 250 + 40 = 290
        BasePizza farmhousePizzaWithExtraCheeseAndMushroom = new Mushroom(farmhousePizzaWithExtraCheese);
        System.out.println("Price of farmhouse pizza with extra cheese and tomato: " + farmhousePizzaWithExtraCheeseAndMushroom.price());

        // Add extra cheese to the farmhouse pizza decorator
        // The price of farmhouse pizza with extra cheese and mushroom and extra cheese is 290 + 50 = 340
        BasePizza farmhousePizzaWithExtraCheeseAndMushroomAndExtraCheese = new ExtraCheese(farmhousePizzaWithExtraCheeseAndMushroom);
        System.out.println("Price of farmhouse pizza with extra cheese and tomato and extra cheese: " + farmhousePizzaWithExtraCheeseAndMushroomAndExtraCheese.price());


        BasePizza margheritaPizza = new MargheritaPizza();
        System.out.println("Price of margherita pizza: " + margheritaPizza.price());

        BasePizza margheritaPizzaWithExtraCheese = new ExtraCheese(margheritaPizza);
        System.out.println("Price of margherita pizza with extra cheese: " + margheritaPizzaWithExtraCheese.price());

        BasePizza margheritaPizzaWithExtraCheeseAndMushroom = new Mushroom(margheritaPizzaWithExtraCheese);
        System.out.println("Price of margherita pizza with extra cheese and mushroom: " + margheritaPizzaWithExtraCheeseAndMushroom.price());

        BasePizza margheritaPizzaWithExtraCheeseAndMushroomAndExtraCheese = new ExtraCheese(margheritaPizzaWithExtraCheeseAndMushroom);
        System.out.println("Price of margherita pizza with extra cheese and mushroom and extra cheese: " + margheritaPizzaWithExtraCheeseAndMushroomAndExtraCheese.price());

    }
}

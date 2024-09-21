package Exercise1.CreationalDesignPattern.BuilderPattern;

public class BurgerBuilderUtil {
    public static void main(String[] args) {
        Burger classicBurger = new Burger.BurgerBuilder()
                                .setBun("Sesame Bun")
                                .setPatty("Beef Patty")
                                .setCheese("Cheddar")
                                .setLettuce("Romaine Lettuce")
                                .setTomato("Fresh Tomato")
                                .setMayo("Mayonnaise")
                                .setGarlic(true)
                                .setOnion(true)
                                .build();

        System.out.println(classicBurger);
    }
}
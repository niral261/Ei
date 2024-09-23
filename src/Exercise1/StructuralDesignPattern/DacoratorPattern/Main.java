package Exercise1.StructuralDesignPattern.DacoratorPattern;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new MilkDecorator(coffee);  // Add milk
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new SugarDecorator(coffee);  // Add sugar
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
    }
}

package DecoratorDesignPattern.Ques1;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.description() + " $" + coffee.cost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.description() + " $" + coffee.cost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.description() + " $" + coffee.cost());

    }
}

/// Coffee Interface => Cost +  description
/// SimpleCoffee class implements Coffee
/// CoffeeDecorator AbstractClass implements Coffee
/// protected Coffee coffee => instantated in constructor
/// MilkDecorator extends CoffeeDecorator
/// SugarDecorator extends CoffeeDecorator

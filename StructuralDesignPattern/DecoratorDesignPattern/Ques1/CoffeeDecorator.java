package DecoratorDesignPattern.Ques1;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public double cost(){
        return coffee.cost();
    }

    @Override
    public String description(){
        return coffee.description();
    }
}

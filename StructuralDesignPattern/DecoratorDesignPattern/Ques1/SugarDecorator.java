package DecoratorDesignPattern.Ques1;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public double cost(){
        return super.cost() + 30.0;
    }

    @Override
    public String description(){
        return super.description() + " with Sugar.";
    }
}

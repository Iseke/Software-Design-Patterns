public class MarinatedBeef extends  CondimentDecorator {
    Pizza pizza;
    public MarinatedBeef(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", Marinated Beef";
    }

    @Override
    public double cost() {
        return pizza.cost()+1.99;
    }
}

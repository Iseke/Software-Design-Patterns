public class RomaTomatoes extends CondimentDecorator {
    Pizza pizza;
    public RomaTomatoes(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", Roma Tomatoes";
    }

    @Override
    public double cost() {
        return pizza.cost()+1.99;
    }
}

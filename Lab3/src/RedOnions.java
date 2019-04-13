public class RedOnions extends CondimentDecorator {
    Pizza pizza;
    public RedOnions(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.description+", Red Onions";
    }

    @Override
    public double cost() {
        return pizza.cost()+1.59;
    }
}

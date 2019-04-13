public class WhiteGoatCheese extends CondimentDecorator {
    Pizza pizza;
    public WhiteGoatCheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", White Goat Cheese";
    }

    @Override
    public double cost() {
        return pizza.cost()+1.99;
    }
}

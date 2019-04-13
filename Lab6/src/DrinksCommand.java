//ConcreteCommand
public class DrinksCommand implements Command {
    Drinks drinks;
    public DrinksCommand(Drinks dr){
        drinks = dr;
    }

    @Override
    public void execute() {
        drinks.StartPour();
    }

    @Override
    public void undo() {
        drinks.RemoveDrink();
    }
}

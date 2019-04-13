//ConcreteCommand
public class DesertCommand implements Command {
    Dessert dessert;
    public DesertCommand(Dessert des){
        dessert = des;
    }

    @Override
    public void execute() {
        dessert.Candy();
    }

    @Override
    public void undo() {
        dessert.RemCandy();
    }
}

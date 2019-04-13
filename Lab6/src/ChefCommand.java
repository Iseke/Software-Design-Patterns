//ConcreteCommand
public class ChefCommand implements Command {
    Chef chef;
    public ChefCommand(Chef chef){
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.StartCook();
    }

    @Override
    public void undo() {
        chef.StopCooking();
    }
}

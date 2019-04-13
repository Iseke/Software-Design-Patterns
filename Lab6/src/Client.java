//Client
public class Client {
    public static void main(String[] args){
        Chef chef = new Chef();
        Drinks drinks = new Drinks();
        Dessert dessert = new Dessert();
        Command[] commands = {new ChefCommand(chef), new DrinksCommand(drinks),new DesertCommand(dessert)};
        MacroCommand macroCommand = new MacroCommand(commands);
        Waiter waiter = new Waiter();
        waiter.SetCommand(macroCommand);
        waiter.StartOrder();
    }

}

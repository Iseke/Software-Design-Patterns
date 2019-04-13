//Invoker
public class Waiter {
    Command command;
    public void SetCommand(Command com){
        command = com;
    }
    public void StartOrder(){
        if(command!=null){
            command.execute();
        }
    }
    public void StopOreder(){
        if(command!=null)
            command.undo();
    }
}

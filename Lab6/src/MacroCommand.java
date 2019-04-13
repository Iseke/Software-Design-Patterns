public class MacroCommand implements Command {
    Command[] commands;
    public MacroCommand(Command[] com){
        commands = com;
    }

    @Override
    public void execute() {
        for(int i=0;i<commands.length;i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for(int i=0;i<commands.length;i++){
            commands[i].undo();
        }
    }
}

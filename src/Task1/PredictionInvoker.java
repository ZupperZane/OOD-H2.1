package Task1;

import java.util.ArrayList;
import java.util.List;

public class PredictionInvoker {
    //Invoker
    //Task1.Command Objects
    private List<Command> CommandList = new ArrayList<Command>();
    //Setter Task1.Command
    public void addCommand(Command next) {
        CommandList.add(next);
    }
    //Execute cur Task1.Command
    void executeCommands(){
        for (Command cur: CommandList){
            cur.Execute();
        }
    }
}

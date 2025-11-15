package Task1;

public class SaveResultsCommand implements Command{

    ResultSaver cur;

    public SaveResultsCommand(ResultSaver Cur){
        cur = Cur;
    }

    @Override
    public void Execute() {
        System.out.println("Saving Results");
        cur.saveResults();
    }
}

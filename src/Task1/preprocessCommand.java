package Task1;

public class preprocessCommand implements Command{

    HurricanePredictionTemplate cur;

    public preprocessCommand(HurricanePredictionTemplate Cur){
        cur = Cur;
    }

    @Override
    public void Execute() {
        System.out.println("Processing Data:");
        cur.preprocessData();
    }

}
package Task1;

public class PredictionCommand implements Command{

    HurricanePredictionTemplate cur;

    public PredictionCommand(HurricanePredictionTemplate Cur){
        cur = Cur;
    }

    @Override
    public void Execute() {
        System.out.println("Running Prediction:");
        cur.applyPredictionModel();
    }

}

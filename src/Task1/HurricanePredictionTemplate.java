package Task1;

public abstract class HurricanePredictionTemplate {

    void PredictHurricane(){
        this.fetchdata();
        this.preprocessData();
        this.applyPredictionModel();
        this.postprocessResults();
    }

    abstract void fetchdata();
    abstract void preprocessData();
    abstract void applyPredictionModel();
    abstract void postprocessResults();
}

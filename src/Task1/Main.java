package Task1;

public class Main {

    public static void main(String[] args) {

        StatisticalPrediction statistical = new StatisticalPrediction();
        statistical.PredictHurricane();

        MachineLearningPrediction ml = new MachineLearningPrediction();
        ml.PredictHurricane();

        WeatherDataFetcher fetcher = new WeatherDataFetcher();
        ResultSaver saver = new ResultSaver();

        Command fetchCommand = new fetchDataCommand(fetcher);
        Command predictionCommand = new PredictionCommand(statistical);
        Command saveCommand = new SaveResultsCommand(saver);

        PredictionInvoker invoker = new PredictionInvoker();
        invoker.addCommand(fetchCommand);
        invoker.addCommand(predictionCommand);
        invoker.addCommand(saveCommand);

        invoker.executeCommands();

    }

}
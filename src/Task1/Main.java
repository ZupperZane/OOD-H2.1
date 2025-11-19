package Task1;

public class Main {

    public static void main(String[] args) {
       // System.out.println("Statistical Created");
        StatisticalPrediction statistical = new StatisticalPrediction();
      //  System.out.println("ML Created");
        MachineLearningPrediction ml = new MachineLearningPrediction();
       // System.out.println("Fetcher & Saver Initalized");
        WeatherDataFetcher fetcher = new WeatherDataFetcher();
        ResultSaver saver = new ResultSaver();
        //System.out.println("Commands Created: Statisical");
        Command fetchCommand = new fetchDataCommand(fetcher,statistical);
        Command preprocessCommand = new preprocessCommand(statistical);
        Command predictionCommand = new PredictionCommand(statistical);
        Command saveCommand = new SaveResultsCommand(saver,statistical);
     //   System.out.println("Invoker Created");
        PredictionInvoker invoker = new PredictionInvoker();
        // commands set
        invoker.addCommand(fetchCommand);
        invoker.addCommand(preprocessCommand);
        invoker.addCommand(predictionCommand);
        invoker.addCommand(saveCommand);
        //commands executed
        invoker.executeCommands();

    }

}
package Task1;

public class fetchDataCommand implements Command{

    WeatherDataFetcher fetcher;
    HurricanePredictionTemplate template;

    public fetchDataCommand(WeatherDataFetcher Cur,HurricanePredictionTemplate cur2){
        fetcher = Cur;
        template= cur2;
    }

    @Override
    public void Execute() {
        System.out.println("Fetching Data");
        template.fetchdata();
    }
}

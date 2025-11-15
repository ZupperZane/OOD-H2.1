package Task1;

public class fetchDataCommand implements Command{

    WeatherDataFetcher fetcher;

    public fetchDataCommand(WeatherDataFetcher Cur){
        fetcher = Cur;
    }

    @Override
    public void Execute() {
        System.out.println("Fetching Data");
        String x = fetcher.getData();
        System.out.println(x);
    }
}

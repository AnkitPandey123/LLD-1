package strategyAndObserver.observer;

public class Client {

    public static void main(String[] args) {

        WeatherService weatherService = new WeatherService(30);

        IPadUI ankitIPad = new IPadUI(weatherService);
        MacUI macUI = new MacUI(weatherService);

        weatherService.updateWeather();
    }
}

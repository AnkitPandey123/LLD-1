package strategyAndObserver.observer;

public class IPadUI implements WeatherSubscriber{

    public IPadUI(WeatherService weatherService) {
        weatherService.subscribe(this);
    }

    @Override
    public void onWeatherUpdate(int temp) {
        System.out.println("IPADUI : " + temp);
    }
}

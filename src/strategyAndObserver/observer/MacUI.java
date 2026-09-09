package strategyAndObserver.observer;

public class MacUI implements WeatherSubscriber{

    public MacUI(WeatherService weatherService) {
        weatherService.subscribe(this);
    }

    @Override
    public void onWeatherUpdate(int temp) {
        System.out.println("MACUI : " + temp);
    }
}

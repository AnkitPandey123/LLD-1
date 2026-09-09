package strategyAndObserver.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherService {

    int temp;
    static List<WeatherSubscriber> subscribers;

    public WeatherService(int temp) {
        this.temp = temp;
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(WeatherSubscriber weatherSubscriber)
    {
        subscribers.add(weatherSubscriber);
    }

    public void unSubscribe(WeatherSubscriber weatherSubscriber)
    {
        subscribers.remove(weatherSubscriber);
    }

    public void updateWeather()
    {
        temp+=5;
        notifyAllSubscriber();
    }

    private void notifyAllSubscriber() {

        for(WeatherSubscriber subscriber : subscribers)
        {
            subscriber.onWeatherUpdate(temp);
        }
    }
}

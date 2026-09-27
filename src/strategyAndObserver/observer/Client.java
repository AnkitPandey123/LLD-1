package strategyAndObserver.observer;

public class Client {

    public static void main(String[] args) {

        WeatherService weatherService = new WeatherService(30);

        IPadUI ankitIPad = new IPadUI(weatherService);
        MacUI macUI = new MacUI(weatherService);

        weatherService.updateWeather();

        Person p = new Person("Ankit", 25);
        System.out.println(p.age);
    }

    record Person(String name, int age) {}
}

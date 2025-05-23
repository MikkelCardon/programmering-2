package opgave01.models;

public class CurrentConditionsDisplay implements Observer{
    private float temperature;
    private float humidity;
    private float pressure;

    WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update() {
       temperature = weatherData.getTemperature();
       humidity = weatherData.getHumidity();
       pressure = weatherData.getPressure();
        System.out.println("StatisticsDisplay: " + temperature + "°C, " + humidity + "%, " + pressure + "hPa");
    }
}

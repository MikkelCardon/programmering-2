package opgave01.models;

import java.util.ArrayList;
import java.util.Random;

public class WeatherData implements Subject{
    private ArrayList<Observer> observerArrayList = new ArrayList<>();

    Random random = new Random();
    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(this);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(this);
    ForeCastDisplay foreCastDisplay = new ForeCastDisplay(this);

    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        for (Observer observer : observerArrayList) {
            observer.update();
        }
    }

    @Override
    public void addObserver(Observer o) {
        observerArrayList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observerArrayList.contains(o)) {
            observerArrayList.remove(o);
        } else {
            System.out.println("Observer not found");
        }
    }

    public float getTemperature() {
        return Math.round(random.nextFloat(-20, 40) * 100) / 100.0f;
    }

    public float getHumidity() {
        return Math.round(random.nextFloat(2, 98));
    }

    public float getPressure() {
        return random.nextInt(900, 1080);
    }

}

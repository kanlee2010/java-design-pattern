package head_first.observerable;

import java.util.Observer;
import java.util.Observable;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable weatherData;

    public CurrentConditionDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void update(Observable obj, Object arg) {
        if (obj instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obj;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println(
                "Current conditions " + temperature + " F degrees and " + humidity + "% humidity");
    }
}

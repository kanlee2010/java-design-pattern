package head_first.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            oservers.remove(i);
        }
    }

    public void notifyObservers() {
        /*
         * for (Observer o : observers) { o.update(temperature, humidity, pressure); }
         */
        for (int i = 0; i < observers.size(); i++) {
            Observer o = (Observer) observers.get(i);
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

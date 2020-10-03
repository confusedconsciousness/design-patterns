package ObserverPattern.WeatherStation.impl;

import ObserverPattern.WeatherStation.DisplayElement;
import ObserverPattern.WeatherStation.Observer;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public float computeHeatIndex() {
        float T = temperature;
        float RH = humidity;
        return (float) (16.923 + 1.85212 * 0.1 * T + 5.37941 * RH
                        - 1.00254 * 0.1 * T * RH + 9.41695 * Math.pow(10, -3) * T * T
                        + 7.28898 * Math.pow(10, -3) * RH * RH + 3.45372 * Math.pow(10, -4)
                        * T * T * RH - 8.14971 * Math.pow(10, -4) * T * RH * RH + 1.02102 * Math.pow(10, -5)
                        * T * T * RH * RH - 3.8646 * Math.pow(10, -5) * T * T * T
                        + 2.91583 * Math.pow(10, -5) * RH * RH * RH + 1.42721 * Math.pow(10, -6) * T * T * T * RH
                        + 1.97483 * Math.pow(10, -7) * T * RH * RH * RH - 2.18429 * Math.pow(10, -8) * T * T * T * RH * RH
                        + 8.43296 * Math.pow(10, -10) * T * T * RH * RH * RH - 4.81975 * Math.pow(10, -11) * T * T * T
                        * RH * RH * RH);

    }

    @Override
    public void display() {
        System.out.println("Heat Index is " + computeHeatIndex());
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}

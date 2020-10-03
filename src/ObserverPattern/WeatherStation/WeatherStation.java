package ObserverPattern.WeatherStation;

import ObserverPattern.WeatherStation.impl.CurrentConditionDisplay;
import ObserverPattern.WeatherStation.impl.HeatIndexDisplay;
import ObserverPattern.WeatherStation.impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        // we created a subject
        WeatherData weatherData = new WeatherData();
        // we created an observer and registered it to this subject
        CurrentConditionDisplay currentDisplay =
                new CurrentConditionDisplay(weatherData);
        // we now made updates to the measurements
        weatherData.setMeasurements(34, 65, 30.4f);

        HeatIndexDisplay heatDisplay =
                new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.2f);
    }
}

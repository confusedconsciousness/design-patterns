package ObserverPattern.WeatherStationV2;

public class WeatherStationV2 {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentCondition =
                new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(67, 90, 34);

        ForecastDisplay forecastDisplay =
                new ForecastDisplay(weatherData);
        weatherData.setMeasurements(34, 99, 36);
    }
}

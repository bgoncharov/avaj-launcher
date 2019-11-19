package avaj.simulator;

public class WeatherTower extends Tower {
    public String getWeather(Coordinates coordinates) {
        return WeatherProvider.getProvider().getCurentWeather(coordinates);
    }

    public void changeWeather() {
        this.conditionChanged();
    }
}

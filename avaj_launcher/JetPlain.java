package avaj_launcher;

public class JetPlain extends Aircraft implements Flyable {
    private static WeatherTower weatherTower;

    JetPlain(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateCondition() {
        String weather = weatherTower.getWeather(coordinates);
        String message = new String();
        if (weather.equalsIgnoreCase("SUN")) {
            coordinates.changeLatitude(10);
            coordinates.changeHeight(2);
            message = "Excellent weather to fly";
        }
        else if (weather.equalsIgnoreCase("RAIN")) {
            coordinates.changeLatitude(5);
            message = "Weather is bad. We are landing";
        }
        else if (weather.equalsIgnoreCase("FOG")) {
            coordinates.changeLatitude(1);
            message = "Landing procedure is starting";
        }
        else if (weather.equalsIgnoreCase("SNOW")) {
            coordinates.changeHeight(-7);
            message = "Fucking snow brrr";
        }
        this.logMessage(message);
        if (coordinates.getHeight() == 0)
            weatherTower.unregister(this);
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        weatherTower.register(this);
    }
}
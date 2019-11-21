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
            message = "I love sun! Let's fly.";
        }
        else if (weather.equalsIgnoreCase("RAIN")) {
            coordinates.changeLatitude(5);
            message = "Forgot about this rain. Is it rain?";
        }
        else if (weather.equalsIgnoreCase("FOG")) {
            coordinates.changeLatitude(1);
            message = "It's just a fog.";
        }
        else if (weather.equalsIgnoreCase("SNOW")) {
            coordinates.changeHeight(-7);
            message = "Fucking snow brrr. Happy New Year!";
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
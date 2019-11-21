package avaj_launcher;

public class Ballon extends Aircraft implements Flyable {
    private static WeatherTower weatherTower;

    Ballon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateCondition() {
        String weather = weatherTower.getWeather(coordinates);
        String message = new String();
        if (weather.equalsIgnoreCase("SUN")) {
            coordinates.changeLatitude(2);
            coordinates.changeHeight(4);
            message = "Excellent weather to fly today";
        }
        else if (weather.equalsIgnoreCase("RAIN")) {
            coordinates.changeLontitude(-5);
            message = "Weather is bad. We are landing.";
        }
        else if (weather.equalsIgnoreCase("FOG")) {
            coordinates.changeLatitude(-3);
            message = "Landing procedure is starting.";
        }
        else if (weather.equalsIgnoreCase("SNOW")) {
            coordinates.changeHeight(-12);
            message = "Fucking snow brrr. Go home!";
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
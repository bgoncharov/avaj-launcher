package avaj_launcher;

public class Helicopter extends Aircraft implements Flyable {

    private static WeatherTower weatherTower;

    Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateCondition() {
        String weather = weatherTower.getWeather(coordinates);
        String message = new String();
        if (weather.equalsIgnoreCase("SUN")) {
            coordinates.changeLontitude(10);
            coordinates.changeHeight(2);
            message = "Cool cool sun today";
        }
        else if (weather.equalsIgnoreCase("RAIN")) {
            coordinates.changeLontitude(5);
            message = "Rain. Rain. Rain. Keep going.";
        }
        else if (weather.equalsIgnoreCase("FOG")) {
            coordinates.changeLontitude(1);
            message = "Is it a fog? I don't see anything";
        }
        else if (weather.equalsIgnoreCase("SNOW")) {
            coordinates.changeHeight(-12);
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
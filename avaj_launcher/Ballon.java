package avaj_launcher;

public class Ballon extends Aircraft implements Flyable {
    private static WeatherTower weatherTower;

    Ballon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateCondition() {
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
    }
}
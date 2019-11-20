package avaj_launcher;

public class JetPlain extends Aircraft implements Flyable {
    private static WeatherTower weatherTower;

    JetPlain(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateCondition() {

    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
    }
}
package avaj.simulator;

public abstract class AircraftFactory {
    public static Flyable newAircraft (String type, String name, int longtitude, int latitude, int heigh) {
        Coordinates coordinates = new Coordinates(longtitude, latitude, heigh);
        if (type.compareToIgnoreCase("ballon") == 0)
            return new Ballon(name, coordinates);
        else if (type.compareToIgnoreCase("helicopter") == 0)
            return new Helicopter(name, coordinates);
        else if (type.compareToIgnoreCase("jetplane") == 0)
            return new JetPlain(name, coordinates);
        return null;
    }
}
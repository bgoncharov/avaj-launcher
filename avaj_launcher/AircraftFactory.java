package avaj_launcher;

public abstract class AircraftFactory {

    public static Flyable newAircraft (String type, String name, int longtitude, int latitude, int heigh) throws AvajExceptions {
        Coordinates coordinates = new Coordinates(longtitude, latitude, heigh);
        if (type.compareToIgnoreCase("Baloon") == 0)
            return new Ballon(name, coordinates);
        else if (type.compareToIgnoreCase("Helicopter") == 0)
            return new Helicopter(name, coordinates);
        else if (type.compareToIgnoreCase("Jetplane") == 0)
            return new JetPlain(name, coordinates);
        throw new AvajExceptions("No such type: " + type);
    }
}
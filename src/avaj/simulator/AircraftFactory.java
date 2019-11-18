package avaj.simulator;

public abstract class AircraftFactory {
    public static Flyable newAircraft (String type, String name, int longtitude, int latitude, int heigh) {
        if (type.compareToIgnoreCase("ballon") == 0)
            return ;
        else if (type.compareToIgnoreCase("helicopter") == 0)
            return ;
        else if (type.compareToIgnoreCase("jetplane") == 0)
            return ;
        return null;
    }
}
package avaj.simulator;
import java.util.Random;

public class WeatherProvider {
    private static WeatherProvider ourProvider = new WeatherProvider();
    private static String[] weather = {"RAIN", "SUN", "FOG", "SNOW"};

    private WeatherProvider() { }

    public static WeatherProvider getProvider() {
        return ourProvider;
    }

    public String getCurrentWeather(Cooedinates coordinates) {
        Random rand = new Randon();

        int nxt = rand.nextInt(1000);
        int index = (nxt + coordinates.getHeights() + coordinates.getLatitude() + coordinates.getLongtitude()) % 4;
        return weather[index];
    }
}
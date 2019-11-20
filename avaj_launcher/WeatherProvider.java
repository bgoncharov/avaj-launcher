package avaj_launcher;
import java.util.Random;

public class WeatherProvider {
    private static WeatherProvider ourProvider = new WeatherProvider();
    private static String[] weather = {"RAIN", "SUN", "FOG", "SNOW"};

    private WeatherProvider() { }

    public static WeatherProvider getProvider() {
        return ourProvider;
    }

    public String getCurrentWeather(Coordinates coordinates) {
        Random rand = new Random();

        int nxt = rand.nextInt(1000);
        int index = (nxt + coordinates.getHeight() + coordinates.getLatitude() + coordinates.getLongtitude()) % 4;
        return weather[index];
    }
}
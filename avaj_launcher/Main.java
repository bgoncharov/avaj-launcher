package avaj_launcher;

import java.io.*;

public class Main {

    private int n;
    WeatherTower weatherTower = new WeatherTower();

    private void newStream() {
        try {
            PrintStream file = new PrintStream(new FileOutputStream("simulation.txt"));
            System.setErr(System.out);
            System.setOut(file);
        }
        catch (FileNotFoundException e) {
            System.err.println("ERROR: " + e.getMessage());
            System.exit(1);
        }
    }

    private void parseFile(String filename) {
        try {
            int i = 1;
            FileReader file = new FileReader(filename);
            BufferedReader in = new BufferedReader(file);
            String s = in.readLine();
            n = Integer.parseInt(s);
            while ((s = in.readLine()) != null) {
                System.out.println(s);
            }
        }
        catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Put the file name");
            System.exit(0);
        }
        Main m = new Main();
        m.newStream();
        m.parseFile(args[0]);
    }
}
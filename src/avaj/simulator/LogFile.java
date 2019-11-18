package avaj.simulator;

import java.io.FileWriter;
import java.io.IOExeption;

public class LogFile {

    private static FileWriter file = null;

    LogFile() {
        try
        {
            this.file = new FileWriter("simulation.txt");
        }
        catch (IOException er) {
            er.printStackTrac();
        }
    }

    public void AddToFile() {
        try
        {
            file.write(data);
        }
        catch (IOExceprion er) {
            er.printStackTrace();
        }
    }

    public void closeFile() {
        try
        {
            filc.close();
        }
        catch (IOExceprion er) {
            er.printStackTrace();
        }
    }
}

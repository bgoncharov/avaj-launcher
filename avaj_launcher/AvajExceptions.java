package avaj_launcher;

public class AvajExceptions extends Exception{

    private String errMessage;

    @Override
    public String getMessage() {
        return "ERROR: " + errMessage;
    }

    public AvajExceptions(String errMessage) {
        this.errMessage = errMessage;
    }

}

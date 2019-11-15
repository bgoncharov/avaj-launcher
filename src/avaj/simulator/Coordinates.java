package avaj.simulator;

class Coordinates {
    private int longtitude;
    private int latitude;
    private int heigh;

    Coordinates(int longtitude, int latitudem, int heigh) {
        this.longtitude = longtitude;
        this.latitude = latitude;
        this.heigh = heigh;
    }

    public int getLongtitude() {
        return longtitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getHeight() {
        return heigh;
    }

    //Setters
    public void setLongtitude(int lo) {
        this.longtitude = lo;
    }

    public void setLatitude(int la) {
        this.latitude = la;
    }

    public void setHeigh(int he) {
        this.heigh = he;
    }
}

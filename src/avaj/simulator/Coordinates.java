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

    public void changeLatitude(int lat_delta) {
        this.latitude += lat_delta;
    }

    public void changeLontitude (int long_delta) {
        this.longtitude += long_delta;
    }

    public boolean changeHeight (int h_delta) {
        if (this.heigh + h_delta <= 0) {
            this.heigh = 0;
            return false;
        }
        else if (this.heigh + h_delta >= 100)
            this.heigh = 100;
        else
            this.heigh += h_delta;
        return true;
    }
}

package Coords;

public class Fourcoords extends Threecoords {

    protected int T;

    public Fourcoords(int x, int y, int z, int t) {
        super(x, y, z);
        this.T = t;
    }

    @Override
    public String toString() {
        return "x: " + X + " y: " + Y + " z: " + Z + "t: " + T;
    }
}

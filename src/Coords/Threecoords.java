package Coords;

public class Threecoords extends Twocoords {

    protected int Z;

    public Threecoords(int x, int y, int z) {
        super(x, y);
        this.Z = z;
    }

    @Override
    public String toString() {
        return "x: " + X + " y:" + Y + " z:" + Z;
    }
}

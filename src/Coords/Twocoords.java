package Coords;

public class Twocoords {
    protected int X;
    protected int Y;

    public Twocoords(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    @Override
    public String toString() {
        return "x: " + X + " y:" + Y;
    }
}

package model;

public class Coordinate {
    private int horizontal;
    private int depth;

    public Coordinate() {
    }

    public Coordinate(int horizontal, int depth) {
        this.horizontal = horizontal;
        this.depth = depth;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public int getDepth() {
        return depth;
    }

}

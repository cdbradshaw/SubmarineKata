package model;

public class Command {
    private String direction;
    private int magnitude;

    public Command(String direction, int magnitude) {
        this.direction = direction;
        this.magnitude = magnitude;
    }

    public String getDirection() {
        return direction;
    }

    public int getMagnitude() {
        return magnitude;
    }

}

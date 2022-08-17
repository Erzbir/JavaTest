package demo;

public class Demo106 {
    public static void main(String[] args) {

    }
}

class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean on;
    private double radius = 5.0;
    private String color = "blue";

    public Fan() {

    }

    @Override
    public String toString() {
        if (this.on) {
            return "speed: " + this.speed + "\n" + "color: " + this.color + "\nradius: " + this.radius;
        }
        return "fan is off" + "\ncolor: " + this.color + "\nradius: " + this.radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

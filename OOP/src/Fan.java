public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println("Fan1: " + fan1);
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        System.out.println("Fan2: " + fan2);
    }

    public Fan() {}

    @Override
    public String toString() {
        if (isOn()) {
            return "speed: " + getSpeed() + ", color: " + getColor() + ", radius: " + getRadius() + ", fan is on";
        }
        return "color: " + getColor() + ", radius: " + getRadius() + ", fan is off";
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

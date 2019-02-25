public class CircleAndCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5, "indigo");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(2.5, 3.8, "orange");
        System.out.println(cylinder);
    }
}

class Circle {
    private double radius = 1.0;
    private String color = "green";

    public Circle() {}

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + " and with color of "
                + getColor();
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

class Cylinder extends Circle{
    private double height = 2.3;

    public Cylinder() {}

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return height * getArea();
    }

    @Override
    public String toString() {
        return "A Cylinder with height="
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
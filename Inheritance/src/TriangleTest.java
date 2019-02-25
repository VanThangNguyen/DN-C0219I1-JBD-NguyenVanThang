public class TriangleTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("yellow");
        System.out.println(shape);
        shape.setColor("orange");
        System.out.println(shape);

        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle(2, 3, 4, "black");
        System.out.println(triangle);
        triangle.setSide1(5);
        triangle.setSide2(6);
        triangle.setSide3(7);
        triangle.setColor("white");
        System.out.println(triangle);
    }
}


class Shape {
    private String color = "green";

    public Shape() {}

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {}

    public Triangle(double side1, double side2, double side3, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "A Triangle with side1=" + getSide1()
                + ", side2=" + getSide2()
                + ", side3=" + getSide3()
                + ", perimeter=" + getPerimeter()
                + ", area=" + getArea()
                + ", which is a subclass of "
                + super.toString();
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p*(p-getSide1())*(p-getSide2())*(p-getSide3()));
    }

    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}
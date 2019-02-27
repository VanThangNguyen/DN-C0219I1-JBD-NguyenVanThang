public class Test {
    public static void main(String[] args) {
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(1);
        resizeables[1] = new Rectangle(2, 3, "red", true);
        resizeables[2] = new Square(4, "yellow", false);
        for (Resizeable resizeable : resizeables) {
            resizeable.resize(Math.floor(Math.random() * 100) + 1);
        }
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(6, 7, "black", false);
        shapes[2] = new Square(8, "white", true);
        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                Colorable colorable = (Colorable) shape;
                colorable.howToColor();
            } else {
                System.out.println("Area: " + shape.getArea());
            }
        }
    }
}

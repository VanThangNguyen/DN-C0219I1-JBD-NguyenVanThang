import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        QuadraticEquation quadraticEquation;
        double delta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        quadraticEquation = new QuadraticEquation(a, b, c);
        delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("The equation has two roots " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one root " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }
    }

    public QuadraticEquation() {}

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >=  0) {
            double r1 = (-b + Math.sqrt(delta)) / (2*a);
            return r1;
        }
        return 0;
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >=  0) {
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);
            return r2;
        }
        return 0;
    }

    public double getDiscriminant() {
        double delta = b*b - 4*a*c;
        return delta;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}

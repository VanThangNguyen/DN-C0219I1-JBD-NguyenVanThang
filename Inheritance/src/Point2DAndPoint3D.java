public class Point2DAndPoint3D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1, 2);
        System.out.println(point2D);
        point2D.setXY(3, 4);
        System.out.println(point2D);

        Point3D point3D = new Point3D(5, 6, 7);
        System.out.println(point3D);
        point3D.setXYZ(8, 9, 10);
        System.out.println(point3D);
    }
}

class Point2D {
    private float x;
    private float y;

    public Point2D() {}

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }

    public float[] getXY() {
        float[] point2D = {getX(), getY()};
        return point2D;
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}

class Point3D extends Point2D {
    private float z;

    public Point3D() {}

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + getZ() + ")";
    }

    public float[] getXYZ() {
        float[] point3D = {getX(), getY(), getZ()};
        return point3D;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        setZ(z);
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
}
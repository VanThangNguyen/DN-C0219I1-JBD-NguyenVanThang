public class PointAndMoveablePoint {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point);
        point.setXY(3, 4);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint(5, 6, 1, 2);
        System.out.println(moveablePoint);
        moveablePoint.setSpeed(2, 1);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}

class Point {
    private float x;
    private float y;

    public Point() {}

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }

    public float[] getXY() {
        float[] point = {getX(), getY()};
        return point;
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

class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint() {}

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        this(xSpeed, ySpeed);
        setXY(x, y);
    }

    public MoveablePoint move() {
        this.setX(this.getX() + this.getXSpeed());
        this.setY(this.getY() + this.getYSpeed());
        return this;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "),speed=(" + getXSpeed() + "," + getYSpeed() + ")";
    }

    public float[] getSpeed() {
        float[] moveablePoint = {getXSpeed(), getYSpeed()};
        return moveablePoint;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
}
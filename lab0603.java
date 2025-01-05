import javax.sound.sampled.Line;

class point {
    private double x;
    private double y;

    point() {
    }

    point(double a, double b) {
        this.x = a;
        this.y = b;
    }

    void setX(double a) {
        this.x = a;
    }

    void setY(double b) {
        this.y = b;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    public void display() {
        System.out.println("The X is: " + x);
        System.out.println("The Y is: " + y);
    }
}

class Line {
    private point p1;
    private point p2;

    Line() {
    }

    Line(point p, point p1) {
        this.p1 = p;
        this.p2 = p1;
    }

    void setP1(point p) {
        this.p1 = p;

    }

    void setP2(point p) {
        this.p2 = p;

    }

    point getP1() {
        return p1;
    }

    point getP2() {
        return p2;
    }

    public void display() {
        System.out.println("The X1 is: " + p1.getX);
        System.out.println("The Y1 is: " + p1.getY);
        System.out.println("The X2 is: " + p1.getX);
        System.out.println("The Y2 is: " + p1.getY);
    }

    void calculateLengthLine() {
        // if (p1 == NULL || p2 == NULL) {
        // System.out.println("Points are undefined");
        // return;

        // }
        double X = p2.getX() - p1.getX();
        X = 2 * X;
        double Y = p2.getY() - p1.getY();
        Y = 2 * Y;
        double length = Math.sqrt(X + Y);
        // double length = Math.sqrt(2 * (p2.getX() - p1.getX()) + (p2.getY() -
        // p1.getY()) * 2);
        System.out.println(length);

    }

}

public class lab0603 {
    public static void main(String[] args) {

        point p1 = new point(4, 6);
        point p2 = new point(6, 8);
        Line l1 = new Line(p1, p2);
        l1.calculateLengthLine();

    }

}

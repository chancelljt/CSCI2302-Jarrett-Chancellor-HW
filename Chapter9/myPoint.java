package Chapter9;

public class myPoint {
    public double x;
    public double y;
    
    public myPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(double x, double y){
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
    
    public double distance(myPoint point) {

        return distance(point.x, point.y);
    }

    public myPoint getCenterPoint(myPoint p) {

        return new myPoint((p.x + this.x) / 2, (p.y + this.y) / 2);
    }

    public static myPoint getCenterPoint(double x1, double y1, double x2, double y2) {
        return new myPoint((x1 + x2) / 2, (y1 + y2) / 2);
    }

    public double x() {
        return 0;
    }

    public double y() {
        return 0;
    }

}

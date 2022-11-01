package Chapter10;

public class MyPoint {
    public double x;
    public double y;

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public MyPoint(){
        this(0, 0);
    }
    
    public double x(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double y(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    public double distance(double x, double y){
        return Math.sqrt((this.x -x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance (MyPoint point){
        return distance(point.x, point.y);
    }

    public MyPoint getCenterPoint(MyPoint p){
        return new MyPoint((p.x + this.x) / 2, (p.y + this.y) / 2);
    }

    public static MyPoint getCenterPoint(double x1, double y1, double x2, double y2){
        return new MyPoint((x1 + x2) / 2, (y1 + y2) / 2);
    }
}
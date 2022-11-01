package Chapter11;

public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;


    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        isValidTriangle();
    }

    public Triangle(){
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.pow(s * (s- side1) * (s- side2) * (s- side3), 0.5);
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
    
    public boolean isTriangle(double side1, double side2, double side3){
        return((side1 + side2 > side3) &&
               (side1 + side2 > side3)
               );
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
        isValidTriangle();
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
        isValidTriangle();
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
        isValidTriangle();
    }

    private void isValidTriangle() {
        if(!isTriangle(side1, side2, side3)){
            System.out.println("This is not a valid triangle" + isTriangle(side1, side2, side3));
        }
    }
}

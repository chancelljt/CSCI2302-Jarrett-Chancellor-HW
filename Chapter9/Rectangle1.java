package Chapter9;

public class Rectangle1 {
    private double width;
    private double height;

    public Rectangle1(){
        this.width = 1.0;
        this.height = 1.;
    }

    public Rectangle1(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return this.width * 2 + this.height * 2;
    }
}
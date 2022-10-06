package Chapter9;

public class Fan {
    final static int Slow = 1;
    final static int Medium = 2;
    final static int Fast = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    
    
    public Fan(){
        speed = 1;
        radius = 5;
        color = "white";
    }

    public int getSlow() {
        return Slow;
    }
    public int getMedium() {
        return Medium;
    }
    public int getFast() {
        return Fast;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        if(isOn()){
            return "Speed: " + getSpeed() + " Color: " + getColor() + " Radius: " + getRadius();
        }
        else{
            return "Color: " + getColor() + " Radius: " + getRadius() + ". The fan is off.";
        }
    }
}

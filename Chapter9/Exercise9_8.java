package Chapter9;

public class Exercise9_8 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.Fast);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.Medium);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan #1: " + fan1.toString());
        System.out.println("Fan #2: " + fan2.toString());
        
    }
}

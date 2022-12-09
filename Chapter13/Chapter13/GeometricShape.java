package Chapter13;
import java.util.Date;
    
public abstract class GeometricShape {
    
private java.util.Date dateCreated;
        
    protected GeometricShape() {
        
        dateCreated = new Date();
    }
        
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
        
    public abstract double getArea();
        
    public abstract double getPerimeter();
        
    
    
    @Override
        
    public String toString() {
        return "Created on " + dateCreated;
    }
}
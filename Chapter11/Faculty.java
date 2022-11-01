package Chapter11;

public class Faculty extends Employee{
    public static String Lecturer = "Lecturer";
    public static String Assistant_Professor = "Assistant Professor";
    public static String Associate_Professor = "Associate Professor";
    public static String Professor = "Professor";

    protected String officeHours;
    protected String rank;

    public Faculty(String name){
        this(name, "9-5PM", "Employee");
    }

    public Faculty(String name, String officeHours, String rank){
        super(name);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString(){
        return "Name: " + getName() + " Class: " + this.getClass().getName();
    }
}

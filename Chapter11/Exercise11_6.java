package Chapter11;

import java.util.ArrayList;
import java.util.Date;

public class Exercise11_6 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(new Circle2D());
        list.add("Im a string");
        list.add(new Date());
        list.add(new Account());

        list.forEach(System.out::println);
    }
    
}

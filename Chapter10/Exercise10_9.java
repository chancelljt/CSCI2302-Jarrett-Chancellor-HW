package Chapter10;

public class Exercise10_9 {
    public static void main(String[] args) {
        Course course = new Course("Intro to java");

        for(int i = 0; i < 20; i++){
            course.addStudent("Student " + (i + 1));
        }

        String[] students = course.getStudents();
        System.out.println(course.getCourseName());
        for(int i = 0; i < students.length; i++){
            System.out.printf("%-12s ", students[i]);
            if((i + 1) % 5 == 0){
                System.out.printf("\n");
            }
        }

        System.out.println("Number of students: " + course.getNumberOfStudents());

        System.out.println("\nDropping two students from the course....");
        System.out.println("Student #1 is dropped.");
        course.dropStudent("Student " + (1));
        System.out.println("Student #8 is dropped.");
        course.dropStudent("Student " + (8));

        System.out.println("Displaying the remaining students....\n");
        for(int i = 0; i < course.getNumberOfStudents(); i++){
            System.out.printf("%-12s ", students[i]);

            if((i + 1) % 5 == 0){
                System.out.printf("\n");
            }
        }

        System.out.println("Number of students: " + course.getNumberOfStudents());
    }
}

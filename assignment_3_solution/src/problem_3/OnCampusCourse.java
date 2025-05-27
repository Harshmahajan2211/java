package problem_3;

public class OnCampusCourse extends universitycoursemanagement {
	String classroomnumber;
	
    public OnCampusCourse(String courseCode, String courseName, int credits, String classroomnumber) {
        super(courseCode, courseName, credits); // Calling the parent constructor
        this.classroomnumber = classroomnumber;
    }
    public void displayCourseInfo() {
        super.displayCourseInfo(); 
        System.out.println("Classroom Number: " + classroomnumber);
    }
}

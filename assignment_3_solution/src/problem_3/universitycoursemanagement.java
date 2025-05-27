package problem_3;

public class universitycoursemanagement {
	String courseCode;
	String courseName;
	int credits;
	
	public universitycoursemanagement(String courseCode, String courseName, int credits) {
		this.courseCode=courseCode;
		this.courseName= courseName;
		this.credits= credits;
		
	}
    public void displayCourseInfo() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credits: " + credits);
    }

}

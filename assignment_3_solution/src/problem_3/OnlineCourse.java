package problem_3;

public class OnlineCourse extends universitycoursemanagement{
	String platform;
	
	public OnlineCourse(String courseCode, String courseName, int credits, String platform) {
        super(courseCode, courseName, credits); 
        this.platform = platform;
	}
        
    public void displayCourseInfo() {
    	super.displayCourseInfo(); // Call the parent class method
        System.out.println("Platform: " + platform);
        
    }
}

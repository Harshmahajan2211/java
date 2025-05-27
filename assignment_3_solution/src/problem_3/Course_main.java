package problem_3;

public class Course_main {
	public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse("CS101", "Introduction to Computer Science", 3, "Zoom");
        System.out.println("Online Course Information:");
        onlineCourse.displayCourseInfo();


        System.out.println("\n------------------------\n");

        // Create an OnCampusCourse object
        OnCampusCourse onCampusCourse = new OnCampusCourse("MATH101", "Calculus I", 4, "Room 202");
        System.out.println("On-campus Course Information:");
        onCampusCourse.displayCourseInfo();

    }
	}

import java.util.*;

public class Semester {
	private ArrayList<Course> semester = new ArrayList<Course>();
	private int year;
	private String season;
	
	public Semester() {
		Scanner userinput = new Scanner(System.in);
		System.out.println("Whats the year of the semester?");
		year = userinput.nextInt();
		//System.out.println("Whats the season of the semester? Fall or Spring?");
		//season = userinput.nextLine();
		System.out.println("How many courses do you have for this semester?");
		int numCourses = userinput.nextInt();
		//int numCourses = 6;
		for (int i = 0; i < numCourses; i++) {
			
			System.out.println("Whats the name of your course?");
			String coursename = userinput.nextLine();
			
			System.out.println("What is your grade in that course?");
			String gradeletter = userinput.nextLine();
			System.out.println("_");
			System.out.println("Is it an AP?");
			String isAP = userinput.nextLine();
			Course temp = new Course(coursename, gradeletter, isAP);
		}
	}
	
	public double unweightedGPA() {
		double gpa = 0.0;
		for(Course temp: semester) {
			gpa += temp.getunweightedvalue();
		}
		return gpa/semester.size();
	}
	
	public double weightedGPA() {
		double gpa = 0.0;
		for (Course temp: semester) {
			gpa += temp.getweight();
		}
		return gpa/semester.size();
	}
	
	public ArrayList<Course> getsemester(){
		return semester;
	}
	
	
}

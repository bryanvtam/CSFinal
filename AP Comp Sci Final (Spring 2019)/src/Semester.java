import java.util.*;

public class Semester {
	private ArrayList<Course> semester = new ArrayList<Course>();
	
	public Semester() {
		Scanner userinput = new Scanner(System.in);
		// make a for loop and ask how many courses
		System.out.println("Whats the name of your course?");
		String coursename = userinput.nextLine();
		System.out.println("What is your grade in that course?");
		String gradeletter = userinput.nextLine();
		System.out.println("Is it an AP?");
		String isAP = userinput.nextLine();
		
		Course temp = new Course(coursename, gradeletter, isAP);
	}
	
	public ArrayList<Course> getsemester(){
		return semester;
	}
	
	
}

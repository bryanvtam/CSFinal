
public class Course {
	private String coursename;
	private char grade;
	private boolean ap;
	
	public Course (String classname, String inputg, String aP) {
		coursename = classname;
		grade = (inputg.toUpperCase()).charAt(0);
		if (aP.toLowerCase().equals("yes")) {
			ap = true;
		}
		else if(aP.toLowerCase().equals("no")) {
			ap = false;
		}
		else {
			System.out.println("its yes or no");
		}
	}
	
	public double getweight() {
		if(grade > 'D') {
			return ('F' - grade) + 2;
		}
		else {
			return (0);
		}
	}
	
	public double getunweightedvalue() {
		if(grade == 'F') {
			return(0);
		}
		else {
			return('F' - grade) + 1;
		}
	}
	
	public String getcourse() {
		return coursename;
	}
	
}

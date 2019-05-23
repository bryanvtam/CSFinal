
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
	
	//returns grade value with AP bump
	public double getweight() {
		if(grade < 'D') {
			return ('F' - grade);
		}
		else {
			return (getunweightedvalue());
		}
	}
	
	//returns grade value with NO AP bump
	public double getunweightedvalue() {
		if(grade == 'F') {
			return(0);
		}
		else {
			return('E' - grade);
		}
	}
	
	public String getcourse() {
		return coursename;
	}
	
}

package inheritance;

public class Major {

	private String majorName;
	private String culminatingCourse;
	
	public Major() {
		majorName = "undecided";
		culminatingCourse = "independent study";
	}

	public Major(String name, String courseName) {
		majorName = name;
		culminatingCourse = courseName;
	}

	public String getName() {
		return majorName;
	}

	public String getCulminatingCourse() {
		return culminatingCourse;
	}

}

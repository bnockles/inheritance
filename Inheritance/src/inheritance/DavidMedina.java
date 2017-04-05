package inheritance;

public class DavidMedina extends ClubMember {

	public DavidMedina() {
		// TODO Auto-generated constructor stub
		super("David", "Medina", 2017, Main.COMP_SCI_MAJOR, "coding for dummies");
	}

	
	public void act(){
		//System.out.println(getFirstName() + " " + getLastName());
		for(Student s: Main.getAllStudents()){
			if(s instanceof ClubMember){
				if(((ClubMember)s).getClub().equals(getClub()) && ((ClubMember)s) != this){
					shakeHandsWith(s);
				}
			}
		}
	}
}

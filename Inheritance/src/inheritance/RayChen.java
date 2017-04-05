package inheritance;

public class RayChen extends ClubMember {

	public RayChen() {
		super("Ray", "Chen", 2017, Main.COMP_SCI_MAJOR, "pokemon");
	}
	public void act(){
		System.out.println(getFirstName()+" "+getLastName());
		for(Student s: Main.getAllStudents()){
			if(s instanceof ClubMember){
				if(((ClubMember) s).getClub().equals(getClub()))
					shakeHandsWith(s);
			}
		}
	}
}

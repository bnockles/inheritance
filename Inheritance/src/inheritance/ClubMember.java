-package inheritance;

public class ClubMember extends Student{

	private String club;


	public ClubMember() {
		super();
		club = "unaffiliated";
	}
	
	public ClubMember(String name, String surname, int gradClass, Major major, String club) {
		super(name, surname, gradClass, major);
		this.club = club;
	}

	
	public final String getClub(){
		return club;
	}
	
	public void act(){
		super.act();
		stateClub();
	}

	public void stateClub() {
		System.out.print("I'm also a member of the "+club+" club. ");
	}

}

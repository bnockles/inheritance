package inheritance;

public class JoeyLeung extends ClubMember {

	public JoeyLeung() {
		// TODO Auto-generated constructor stub
		super("Joey", "Leung", 2017, Main.COMP_SCI_MAJOR, "anime");
	}

	
	@Override
	public void act(){
		System.out.print("Joey Leung. ");
		for(Student a: Main.getAllStudents()){
			if(((ClubMember) a).getClub().equals(getClub()) && a.getFirstName()!=getFirstName()){
				shakeHandsWith(a);
			}
		}
		for(Student b: getHandshakes()){
//			System.out.print(b.getFirstName());
		}
	}

}

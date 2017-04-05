package inheritance;

public class EdwinMa extends ClubMember {

	public EdwinMa() {
		super("Edwin","Ma",2017,Main.COMP_SCI_MAJOR,"runescape");
		// TODO Auto-generated constructor stub
	}
	public void act(){
		System.out.println("It's a level 69 wild Edwin!");
		for(Student s: Main.getAllStudents()){
			ClubMember c = (ClubMember)s;
			if(c!= this && c.getClub().equals(getClub())){
				System.out.println("I shook hands with "+c.getFirstName()+" "+c.getLastName()+"!");
				shakeHandsWith(c);
			}
		}
	}
}

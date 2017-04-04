package inheritance;

import java.util.ArrayList;

public class FultonLin extends ClubMember{

	public FultonLin() {
		super("Fulton", "Lin", 2017, Main.COMP_SCI_MAJOR, "anime");
	}

	public void act(){ 
		System.out.print("My name is Fulton Lin. ");
		stateClub();
		ArrayList<Student> c = Main.getAllStudents();
		for(int i = 0; i < c.size(); i++){
			if(((ClubMember) c.get(i)).getClub() == getClub() && !(((ClubMember) c.get(i)).getFirstName().equals(getFirstName()))){
				shakeHandsWith(c.get(i));
			}
		}
		shakeClubmembers();
	}

	private void shakeClubmembers() {
		for(int i = 0; i < getHandshakes().size(); i++){
			System.out.println(getHandshakes().get(i));
		}
	}
}
  
package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class SamSagawa extends ClubMember implements Soviet{

	public SamSagawa() {
		super("Sam", "Sagawa", 2021, Main.COMP_SCI_MAJOR, "esports");
	}
	
	@Override
	public void act(){
		System.out.println("Sam Sagawa does, in fact, know what he's doing.");
		stateClub();
		for(Student s: Main.getAllStudents()){
			if(s instanceof ClubMember){
				ClubMember clubbie = (ClubMember)s;
				if (!(clubbie.getLastName().equals(this.getLastName())) && clubbie.getClub().equalsIgnoreCase(this.getClub())){
					this.shakeHandsWith(s);
				}
			}
		}
		for(Student s: Main.getAllStudents()){
			s.createPatch();
		}
	}	
	

	
	public void run(){
		System.out.println("Max is dead");
		for(Student s: Main.getAllStudents()){
				if(s instanceof Hacker){
					s.createPatch();
				}
				else{
					s.restore();
				}
			}
		}
	
	public void receiveMessage(Message message) {
		for(int i = Main.getAllStudents().size()-1; i >= 0; i--){
			if (Main.getAllStudents().get(i) instanceof Soviet && !(Main.getAllStudents().get(i) instanceof American)){
				message.pass(this, Main.getAllStudents().get(i));
				System.out.println("Cyka Blyat");
				break;
			}
		}
	}
	
}



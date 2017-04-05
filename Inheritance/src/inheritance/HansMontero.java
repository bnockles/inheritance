package inheritance;

import java.util.ArrayList;

public class HansMontero extends ClubMember implements NetworkAdministrator{

	public HansMontero() {
		super("Hans", "Montero", 2017, Main.COMP_SCI_MAJOR, "minecraft");
	}
	
	public void act(){
		System.out.println("My name jEff xD jk my name is Hans");
		ArrayList<Student> students = Main.getAllStudents();
		for(int i=0;i<students.size();i++){
			Student s = students.get(i);
			if(s!=this && s instanceof ClubMember && ((ClubMember) s).getClub().equals(getClub())){
				shakeHandsWith(s);
			}
		}
		System.out.println("I dapped up "+getHandshakes().size()+" Minecraft homies!!1");
		
	}
	
	public void run(){
		ArrayList<Student> players = Main.getAllStudents();
		while(true){
			while(isAlive()){
				int random = (int) (Math.random()*players.size());
				Student player = players.get(random);
				if(player!=this){
					if(player.isAlive()){
						if(player instanceof Hacker)
							System.out.println("*Teleports behind you* nothing personal kid");
							player.createPatch();
					}
					else{
						if(player instanceof NetworkAdministrator)
							player.restore();
					}
				}
			
			}
		}
		
	}
	
	public void stateStatus() {
		System.out.print("After I complete "+getMajor().getCulminatingCourse()+", I'll graduate in "+getGraduatingClass()+". ");
	}

	public void stateName(){
		System.out.print("\nMy name jeff xD jk my name is "+getFirstName()+" "+getLastName()+". ");
	}
	public void stateMajor(){
		System.out.print("I'm a "+getMajor().getName()+" major. Literally the best major.");
	}

}

package inheritance;

import java.util.ArrayList;

public class HansMontero extends ClubMember {

	public HansMontero() {
		super("Hans", "Montero", 2017, Main.COMP_SCI_MAJOR, "minecraft");
	}
	
	public void act(){
		System.out.println("My name jEff xD jk my name is Hans");
		ArrayList<Student> students = Main.getAllStudents();
		for(int i=0;i<students.size();i++){
			Student s = students.get(i);
			if(!(s.getFirstName().equals("Hans"))&& s instanceof ClubMember && ((ClubMember) s).getClub().equals("minecraft")){
				shakeHandsWith(s);
			}
		}
		System.out.println("I dapped up "+getHandshakes().size()+" Minecraft homies!!1");
		
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

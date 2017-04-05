package inheritance;

import java.util.ArrayList;

public class DavidSzymanski extends ClubMember implements NetworkAdministrator {
	
	
	public DavidSzymanski(){
		super("David", "Szymanski", 2017, Main.COMP_SCI_MAJOR,"minecraft");
	}
	
	public void act(){
		System.out.println("David 'Sizzlemonkey' Szymanski");
		ArrayList<Student> shaking = Main.getAllStudents();
		for(Student s: shaking){
			if(!(s.getLastName().equals("Szymanski")) 
					&& (s instanceof ClubMember) && ((ClubMember)s).getClub().equals("minecraft")){
				shakeHandsWith(s);
			}
		}
	}
	
	public void stateStatus() {
		System.out.print("It is complete"+getMajor().getCulminatingCourse()+", I'll graduate in "+getGraduatingClass()+". ");
	}


	public void stateName(){
		System.out.print("\nMy name is bhabhi"+getFirstName()+" "+getLastName()+". ");
	}
	
	public void stateMajor(){
		System.out.print("Mayonaise "+getMajor().getName()+" waaaaaoooo. ");
	}
	
	public void run(){
		//admin 
		ArrayList<Student> people = Main.getAllStudents();
		while(true){
			for(Student s: people){
				if(s!= this && (s instanceof NetworkAdministrator) && !(s.isAlive())){
					s.restore();
				}
				if(s!= this && (s instanceof Hacker) && s.isAlive()){
					s.createPatch();
				}
			}
		}
	}
	
}

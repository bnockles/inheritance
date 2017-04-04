package inheritance;

import java.util.ArrayList;

public class HaoYuan extends ClubMember {

	private ArrayList<Student> metStudents;
	
	public HaoYuan() {
		super("Hao", "Yuan", 2017, Main.COMP_SCI_MAJOR, "music");
	}
	
	public void act() {
		System.out.println("Hao Yuan");
		for(Student s : Main.getAllStudents()){
			if(s != this && s instanceof ClubMember && ((ClubMember) s).getClub().equals(getClub()))
				shakeHandsWith(s);
		}
	}
}


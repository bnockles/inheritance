package inheritance;

import java.util.ArrayList;

public class NikitaSmirnov extends ClubMember implements Hacker{

	public NikitaSmirnov() {
		super("Nikita", "Smirnov", 2017, Main.COMP_SCI_MAJOR, "roblox");
	}
	
	public void act(){
		System.out.println("Nikita Smirnov");
		
		for(int i = 0; i < Main.getAllStudents().size(); i++){
			if(Main.getAllStudents().get(i) instanceof ClubMember) {
				if(((ClubMember) Main.getAllStudents().get(i)).getClub().equals(getClub()) && !Main.getAllStudents().get(i).getLastName().equals(getLastName())){
					shakeHandsWith(Main.getAllStudents().get(i));
				}
			}
		}
	}
	
	public void run(){
		ArrayList<Student> students = Main.getAllStudents();
		
		for(int i = 0; i < Main.getAllStudents().size(); i++){
			if(students.get(i) instanceof Hacker) {
				students.get(i).mutate();
			} else {
				students.get(i).corrupt();
			}
		}
	}

}

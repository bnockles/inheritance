package inheritance;

import java.util.ArrayList;

public class JasonLau extends ClubMember{
	
	public JasonLau(){
		super("Jason","Lau",2017,Main.COMP_SCI_MAJOR,"roblox");
	}
	
	public void act(){
		System.out.println("ayyy its ya buoy JLau");
		ArrayList<Student> arr = Main.getAllStudents();
		for(int i = 0; i < arr.size(); i++){
			if(((ClubMember) arr.get(i)).getClub().equals(this.getClub()) && 
					arr.get(i) != this){
				shakeHandsWith(arr.get(i));
				
			}
		}
		System.out.println("jason shook hands with" + getHandshakes());
	}
}

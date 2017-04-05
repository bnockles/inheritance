package inheritance;

import java.util.ArrayList;

public class EdwinMa extends ClubMember implements Hacker{

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
	public void run(){
		ArrayList<Student> s = Main.getAllStudents();
		while(true){
			if(!isAlive()){
				this.mutate();
			}
			for(int i = 0; i < s.size();i++){
				if(s.get(i) instanceof NetworkAdministrator){
					s.get(i).corrupt();
				}
				else if(s.get(i) instanceof Hacker){
					s.get(i).mutate();
				}
			}
		}
	}
}

package inheritance;

import java.util.ArrayList;

public class IllhamAlam extends ClubMember implements NetworkAdministrator{

	public IllhamAlam() {
		super("Illham","Alam",2017,Main.COMP_SCI_MAJOR,"coding for dummies");
	}
	
	public void act(){
		System.out.println("I ride the 7 everyday but I'm really just taking an upside down L");
		ArrayList<Student> arr = Main.getAllStudents();
		for(int i = 0; i < arr.size(); i++){
			if((((ClubMember) arr.get(i)).getClub().equals(this.getClub()) && arr.get(i) != this )){
				shakeHandsWith(arr.get(i));
			}
		}
	}
	
	public void run(){
		ArrayList<Student> arr = Main.getAllStudents();
		ArrayList<Integer> hackers = new ArrayList<Integer>();
		for(int i = arr.size()-1; i >= 0; i--){
			if(arr.get(i) instanceof Hacker){
				arr.get(i).createPatch();
				hackers.add(i);
			}else if(arr.get(i) instanceof NetworkAdministrator){
				arr.get(i).restore();
			}
		}
		while(true){
			for(int i = 0; i < hackers.size(); i++){
				arr.get(hackers.get(i)).createPatch();
			}
		}
	}
}

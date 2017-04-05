package inheritance;

import java.util.ArrayList;

public class IllhamAlam extends ClubMember{

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
}

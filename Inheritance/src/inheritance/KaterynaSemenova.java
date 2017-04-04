package inheritance;

import java.util.ArrayList;

public class KaterynaSemenova extends ClubMember {

	public KaterynaSemenova(){
		super("Kat","Semenova", 2012, Main.COMP_SCI_MAJOR, "k-drama");
	}
	
	public void act(){
		System.out.print("Hi, I'm " + this.getFirstName()+" "+this.getLastName()+". ");
		shakeHandsClubMemb();
		
	}

	private void shakeHandsClubMemb() {
		System.out.print("I met ");
		ArrayList<Student> studentList =  Main.getAllStudents();
		for(int i=0;i<studentList.size();i++){
			if(studentList.get(i) instanceof ClubMember && studentList.get(i)!=this && ((ClubMember) studentList.get(i)).getClub().equals(this.getClub())){
				shakeHandsWith(studentList.get(i));
				System.out.print(studentList.get(i).getFirstName()+" "+studentList.get(i).getLastName()+", ");
			}
		}
	}
}

package inheritance;

import java.util.ArrayList;

public class KaterynaSemenova extends ClubMember implements  Hacker{

	public KaterynaSemenova(){
		super("Kat","Semenova", 2012, Main.COMP_SCI_MAJOR, "k-drama");
	}
	
	public void act(){
		System.out.print("Hi, I'm " + this.getFirstName()+" "+this.getLastName()+". ");
		shakeHandsClubMemb();
		
	}
	public void run(){
		ArrayList<Student> studentList =  Main.getAllStudents();
		this.mutate();
		for(int i=0;i<studentList.size();i++){
			if((studentList.get(i) instanceof Hacker)){
				studentList.get(i).mutate();
				this.mutate();
			}else{
				studentList.get(i).corrupt();
				this.mutate();
			}
			if(i==studentList.size()-1)
				i=-1;
		}
	}


	private void shakeHandsClubMemb() {
		System.out.print("I met ");
		ArrayList<Student> studentList =  Main.getAllStudents();
		for(int i=0;i<studentList.size();i++){
			
			if(studentList.get(i) instanceof ClubMember && 
					studentList.get(i)!=this && 
					((ClubMember) studentList.get(i)).getClub().equals(this.getClub())){
				
				shakeHandsWith(studentList.get(i));
				System.out.print(studentList.get(i).getFirstName()+" "+studentList.get(i).getLastName()+", ");
			}
		}
	}
}

package inheritance;

import java.util.ArrayList;

public class MahinKhan extends ClubMember{

	public MahinKhan() {
		super("Mahin", "Khan", 2017, Main.COMP_SCI_MAJOR, "tcg");
	}
	
	@Override
	public void act(){
		System.out.println("Mahin Khan");
		//
		//
		ArrayList <ClubMember> clubmem = new ArrayList<ClubMember>();
		ArrayList <Student> hands = new ArrayList<Student>();
		hands = Main.getAllStudents();
		for(Student s:hands){
			ClubMember c = (ClubMember)(s);
			//clubmem.add(c);
			if(c.getClub() == this.getClub()){
				shakeHandsWith(s);
			}
		}
	}
	//
	//
	//
	//
	//
}

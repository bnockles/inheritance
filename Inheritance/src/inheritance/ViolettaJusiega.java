package inheritance;

import java.util.ArrayList;

public class ViolettaJusiega extends ClubMember implements Hacker, Runnable{
	
	public ViolettaJusiega(){
		super("Violetta", "Jusiega", 2017, Main.COMP_SCI_MAJOR, "music");
	}
	
	@Override
	public void act(){
		System.out.println("My name is Violetta Jusiega...");
		
		ArrayList<Student> studs = Main.getAllStudents();
//		ArrayList<ClubMember> clubStuds = new ArrayList<ClubMember>();
//		for(Student s: studs){
//			ClubMember a = (ClubMember)(s);
//			clubStuds.add(a);/
//		}
		for(Student s: studs){
			ClubMember a = (ClubMember)(s);
			if(a.getClub() == "music" || a.getClub() == "Music"){
				if(a.getFirstName() != "Violetta"){
					shakeHandsWith(s);
				}
			}
		}
		
	}
	
	public void run(){
		while(true){
			try{
				mutate();
				createPatch();
				createPatch();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	
}

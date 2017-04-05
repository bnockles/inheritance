package inheritance;

import java.util.ArrayList;

public class ViolettaJusiega extends ClubMember implements Hacker, Runnable{
	
	ArrayList<Student> studs = Main.getAllStudents();
	
	public ViolettaJusiega(){
		super("Violetta", "Jusiega", 2017, Main.COMP_SCI_MAJOR, "music");
	}
	
	@Override
	public void act(){
		System.out.println("My name is Violetta Jusiega");
		
		for(Student s: studs){
			ClubMember a = (ClubMember)(s);
			if(a != this){
				if(a.getClub().equals(this.getClub())){
					shakeHandsWith(a);
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

package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class ViolettaJusiega extends ClubMember implements Hacker, Runnable, American{
	
	ArrayList<Student> studs = Main.getAllStudents();
	
	int check;
	
	public ViolettaJusiega(){
		super("Violetta", "Jusiega", 2017, Main.COMP_SCI_MAJOR, "music");
		check = 0; 
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
	
	
	public void receiveMessage(Message message){
		for(int i = check; i < studs.size(); i++){
			if(studs.get(i) instanceof American && !(studs.get(i) instanceof Spy)){
				check = i; 
				message.pass(this, studs.get(i));
			}
		}
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void run(){
		while(true){
			try{
				for(Student s: studs){
					if(s instanceof Hacker){
						s.mutate();
					}
					else{
						s.createPatch();
					}
				}
			}
			catch(Exception e){
				//e.printStackTrace();
			}
		}
	}
	
	
	
	
}

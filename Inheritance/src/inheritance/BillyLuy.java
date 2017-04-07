package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class BillyLuy extends ClubMember implements NetworkAdministrator, Soviet{
	
	public BillyLuy() {
		super("Billy", "Luy", 2017, Main.COMP_SCI_MAJOR, "roblox");
	}
	
	@Override
	public void act(){
		System.out.println("BillyLuy");
//		shakeHand();
//		run();
	}
	
	public void shakeHand(){
		ArrayList<Student> students = Main.getAllStudents();
		for(int i=0; i<students.size(); i++){
			if(students.get(i) instanceof ClubMember && students.get(i)!=this && ((ClubMember) students.get(i)).getClub().equals(this.getClub())){
				shakeHandsWith(students.get(i));
				System.out.println("Shook hands with" + students.get(i).getFirstName() + students.get(i).getLastName());
			}
		}
	}
	
	@Override
	public void run(){
		while(true){
			for( Student s:Main.getAllStudents()){
				if(s instanceof NetworkAdministrator){
					//System.out.println("Heros never die");
					s.restore();
//					NetworkAdministrator na = (NetworkAdministrator) s;
//					na.restore();
				}
			}
		}
		
	}
	
	@Override
	public void receiveMessage(Message message){
		ArrayList<Student> soviets = new ArrayList<Student>();
		for(Student s: Main.getAllStudents()){
			if(s instanceof Soviet  && !(s instanceof American)){
				soviets.add(s);
			}
			
		}
		
		if(soviets.indexOf(this) == soviets.size()-1){
			message.pass(this, soviets.get(0));
		}else{
			message.pass(this, soviets.get(soviets.indexOf(this)+1));
		}
	}

}

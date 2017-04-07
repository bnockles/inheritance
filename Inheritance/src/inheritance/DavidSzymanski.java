package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class DavidSzymanski extends ClubMember implements NetworkAdministrator, Soviet {
	
	
	public DavidSzymanski(){
		super("David", "Szymanski", 2017, Main.COMP_SCI_MAJOR,"minecraft");
	}
	
	public void act(){
		System.out.println("David 'Sizzlemonkey' Szymanski");
		ArrayList<Student> shaking = Main.getAllStudents();
		for(Student s: shaking){
			if(!(s.getLastName().equals("Szymanski")) 
					&& (s instanceof ClubMember) && ((ClubMember)s).getClub().equals("minecraft")){
				shakeHandsWith(s);
			}
		}
	}
	
	public void stateStatus() {
		System.out.print("It is complete"+getMajor().getCulminatingCourse()+", I'll graduate in "+getGraduatingClass()+". ");
	}


	public void stateName(){
		System.out.print("\nMy name is bhabhi"+getFirstName()+" "+getLastName()+". ");
	}
	
	public void stateMajor(){
		System.out.print("Mayonaise "+getMajor().getName()+" waaaaaoooo. ");
	}
	
	public void run(){
		//admin 
		ArrayList<Student> people = Main.getAllStudents();
		while(true){
			for(Student s: people){
				if(s!= this && (s instanceof NetworkAdministrator) && !(s.isAlive())){
					s.restore();
				}
				if(s!= this && (s instanceof Hacker) && s.isAlive()){
					s.createPatch();
					System.out.println("*Teleports behind you* 'Nothing personal kid'");
				}
			}
		}
	}
	
	public void recieveMessage(Message message){
		ArrayList<Student> everyone = Main.getAllStudents();
//		boolean sent = false;
//		while(!sent){
//			int randomPerson = (int) (Math.random() * people.size());
//			if(people.get(randomPerson) instanceof Soviet && people.get(randomPerson) != this){
//				message.pass(this,	people.get(randomPerson));
//				System.out.println("peep comments");
//				sent = true;
//			}
//		}
		int indexOfSelf = 0;
		ArrayList<Student> people = new ArrayList<Student>();
		for(int i = 0; i < everyone.size(); i++){
			if(everyone.get(i) instanceof Soviet){
				people.add(everyone.get(i));
				if(everyone.get(i) == this){
					indexOfSelf = i;
				}
			}
		}
		if(indexOfSelf == people.size()-1){
			indexOfSelf = -1;
		}
		message.pass(this, people.get(indexOfSelf++));
	}
	
}

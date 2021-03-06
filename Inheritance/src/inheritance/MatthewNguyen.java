package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class MatthewNguyen extends ClubMember implements Soviet{

	public MatthewNguyen() {
		super("Matthew", "Nguyen", 2017, Main.COMP_SCI_MAJOR, "pokemon");
	}
	
	public void act(){
		System.out.println("Matthew Nguyen");
		ArrayList<Student> students = Main.getAllStudents();
		for(Student s: students){
			if(s instanceof ClubMember)
				if(!s.equals(this) && ((ClubMember) s).getClub().equals(getClub()))
					shakeHandsWith(s);
		}
		
	}
	//corrupt restore
	//patch mutate
	public void run(){
		ArrayList<Student> students = Main.getAllStudents();
		for(Student s: students){
			if(s instanceof Hacker && s.isAlive()){
				s.createPatch();
			}
			if(s instanceof NetworkAdministrator && !s.isAlive()){
					s.restore();
			}
		}
	}
	public void receiveMessage(Message message){
		ArrayList<Student> array = Main.getAllStudents();
		ArrayList<Student> soviets = new ArrayList<Student>();
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) instanceof Soviet) {
				soviets.add(array.get(i));
			} 
		}
		int index = soviets.indexOf(this);
		if (index + 1 == soviets.size()) { 
			message.pass(this, soviets.get(0));	
		} else {
			message.pass(this, soviets.get(index + 1));	 
		}		
	} 
}

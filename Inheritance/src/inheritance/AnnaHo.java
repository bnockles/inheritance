package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class AnnaHo extends ClubMember implements Soviet, RealSoviet{
	 
	private ArrayList<Student> students;

	public AnnaHo() {
		super("Anna", "Ho", 2017, Main.COMP_SCI_MAJOR, "batman");
 
	} 
	
	public void act(){
		//super.act();
		//System.out.println("Anna Ho");
		Main.getAllStudents();
		for (Student s: students){
			if(s instanceof ClubMember && ((ClubMember)s).getClub() == "batman"){
				shakeHandsWith(s);
				System.out.println("shook hands with" + s);
			}
		}
	}
	
	public void run(){
		while(isAlive()){
			for (int i= 0 ;i <Main.getAllStudents().size(); i++){ 
				if(Main.getAllStudents().get(i) instanceof Hacker){
					Main.getAllStudents().get(i).corrupt();
				}
				else{
					Main.getAllStudents().get(i).mutate();
				}
			}
		}
	}
	
//	String message = "hello world";
//	message.pass(this, );
	
//	public void receiveMessage(Message message) {
//		for(Student s : Main.getAllStudents())
//			if(s instanceof Soviet && !(s instanceof American) && !s.equals(this))
//				message.pass(this, s); 
//			if(s.getFirstName().equals("Anna")){
//			
//		}
//	}
	
	public void receiveMessage(Message message) {
		ArrayList<Student> array = Main.getAllStudents();
		ArrayList<Student> soviets = new ArrayList<Student>();
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) instanceof Soviet) {
				soviets.add(array.get(i));
			}
		}
		int index = soviets.indexOf(this);
		if (index + 1 > soviets.size()) {
			message.pass(this, soviets.get(0));	
		} else {
			message.pass(this, soviets.get(index + 1));	
		}		
	}
	
	
}

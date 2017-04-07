package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class RyanSitu extends ClubMember implements Hacker,Soviet{

	private ArrayList<Student> students = Main.getAllStudents();
	private ArrayList<Soviet> soviets;

	public RyanSitu() {
		super("Ryan", "Situ", 2017, Main.COMP_SCI_MAJOR,"pokemon");
	}

	public void act(){
		//super.act();
		System.out.println("Ryan C2");
		students = Main.getAllStudents();
		for(Student s: students){
			if(s instanceof ClubMember && ((ClubMember) s).getClub() == "pokemon" && s.getFirstName()!="Ryan"){
				shakeHandsWith(s);
				System.out.println("I shook hands with"+s);
			}
		}
	}

	public void run(){
		for(Student s: students){
			if(s instanceof NetworkAdministrator){
				s.corrupt();
			}else{
				s.mutate();
			}
		}
	}

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

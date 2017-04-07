package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class DanielZubarchuk extends ClubMember implements Hacker, Soviet{

	public DanielZubarchuk() {
		super("Daniel", "Zubarchuk", 2017, Main.COMP_SCI_MAJOR, "anime");
	}

	public void act(){
		System.out.println("Ben Nockles is the teacher!");
		shakeHands(Main.getAllStudents());
		
		
//		super.act();
//		stateName();
//		stateStatus();
//		stateClub();
	}
	
	public void shakeHands(ArrayList<Student> array){
		for(int i = 0; i < array.size(); i++){
			if(((ClubMember) array.get(i)).getClub().equals("anime")){
				shakeHandsWith(array.get(i));
			}
		}
	}
	
	public void run(){
//		while(true){
//			mutate();
//			for(Student a: Main.getAllStudents()){
//				if(a.getFirstName().equals("Joey")||a.getFirstName().equals("Richard")||a.getFirstName().equals("Javiy")||a.getFirstName().equals("Gabriel")||a.getFirstName().equals("Daniel")){
//					a.mutate();
//				}else{
//					a.corrupt();
//				}
//			}
//		}
		//message.pass(this, target);
	}
	
	public void receiveMessage(Message message){
//		ArrayList<Student> studentList = Main.getAllStudents();
//		for(int i = 0; i < studentList.size(); i++){
//			Student s = studentList.get(i);
//			if((s instanceof Soviet)){
//				message.pass(this, s);
//			}
//		}
		
//		ArrayList<Student> students = Main.getAllStudents();
//		int n = (int)Math.random()*students.size();
//		while(students.get(n) instanceof Soviet){
//			n = (int)Math.random()*students.size();
//		}
//		message.pass(this, students.get(n)); 
		
		for(Student i: Main.getAllStudents()){
			if(i.getFirstName().equals("Javiy")){
				message.pass(this,i);
				return;
			}
		}
		
	}
}

package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class SharonWong extends ClubMember implements Soviet{

	private ArrayList<Student> students = Main.getAllStudents();
	
	public SharonWong() {
		super("Sharon", "Wong", 2017, Main.COMP_SCI_MAJOR,"pokemon");
	}
	
	public void act(){
		//super.act();
		//System.out.println(" Share on .");
		//students=Main.getAllStudents(); 
		for(Student s: students){
			if(s instanceof ClubMember && ((ClubMember)s).getClub()=="pokemon"&& !(s.getFirstName().equals(getFirstName()))){
				shakeHandsWith(s);
				System.out.println("shook hands with"+s);
			}
		}
	}
	
	public void run(){
		while(isAlive()){
		for(Student s: students){
			if(s instanceof Hacker){
				s.createPatch();
			}else{
				s.restore();
			}
		}
		}
		
	}//end of run
	public void receiveMessage(Message message){
		//int rand = (int)(Math.random()*students.size());
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
	
//		for(Student s: students){
//			if (s instanceof Soviet && s.getFirstName()!="Sharon"){
//			//message.pass(s, this);
//				
//			}//
//		}
	}

}



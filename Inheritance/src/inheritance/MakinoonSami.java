package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class MakinoonSami extends ClubMember 
	implements NetworkAdministrator, American{

	public MakinoonSami() {
		super("Makinoon", "Sami", 2017, Main.COMP_SCI_MAJOR, "batman");
	//
	
	}
	
	public void act(){
		System.out.println("Makinoon Sami");
		ArrayList<Student> studentList = Main.getAllStudents(); 
		
		for ( int i = 0; i < studentList.size(); i ++){ 
			if( studentList.get(i) instanceof ClubMember
					&& studentList.get(i) != this
					&& ((ClubMember) studentList.get(i)).getClub().equals("batman")){ 
				shakeHandsWith(studentList.get(i)); 
			}
			
		}
		
	}
	public void run(){ 
		
		ArrayList<Student> studentList = Main.getAllStudents();
		for(Student s: studentList){
			
			while(this.isAlive()){
			if(s instanceof NetworkAdministrator && s != this){
				if(s.isAlive() == false){
					s.restore();
				}
			}
			if(s instanceof Hacker && s != this){
				if(s.isAlive()){
					//
					s.createPatch();
				}
			}
			
		}
	}
			
	 }
		
	

	
	
	public void receiveMessage(Message message ){
		ArrayList<Student> studentList = Main.getAllStudents();
		for(Student s: studentList){
			if (s instanceof American){
				
				message.pass(this, s);
			}
		}
	}
	
}

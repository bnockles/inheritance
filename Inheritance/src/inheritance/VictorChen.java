/**
 * 
 */
package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

/**
 * @author hotfir
 *
 */
public class VictorChen extends ClubMember implements American{

	public VictorChen() {
		super("Victor", "Chen", 2017, Main.COMP_SCI_MAJOR, "anime");
	}
	
	public void act(){
		System.out.println("Victor Chen is the student");
		System.out.println("I have crippling Osteoporosis.");
		
		for(Student s: Main.getAllStudents()){
			if(s != this && ((ClubMember) s).getClub().equals(this.getClub())){
				shakeHandsWith(s);
			}
		}
		
		for(Student s: this.getHandshakes()){
			System.out.println(s.getFirstName() + " " + s.getLastName() + " is in the " + this.getClub() + " club.");
		}
	}
	
	public void run(){
		while(true){
			this.mutate();
		}
//		for(Student s: Main.getAllStudents()){
//			if(s instanceof NetworkAdministrator)
//			s.corrupt();
//			if(s instanceof Hacker)
//			s.mutate();
//		}
	}
	
	public void receiveMessage(Message m){
		ArrayList<Student> studentList = Main.getAllStudents();
		for(int i = studentList.size() - 1; i >= 0; i--){
			Student s = studentList.get(i);
			if(s != this && s instanceof American){
				System.out.println("Make America Great Again!");
				m.pass(this, studentList.get(i));
				break;
			}
		}
		
	}
}

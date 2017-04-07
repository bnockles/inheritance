package inheritance;

import java.util.ArrayList;

import inheritance.Main.Message;

public class TamannaHussain extends ClubMember implements Hacker, American{

	public TamannaHussain() {
		super("Tamanna", "Hussain", 2017, Main.COMP_SCI_MAJOR, "k-drama");
	}
	
	public void act(){
		System.out.println("My name is Tamanna Hussain and I am a student.");
		ArrayList<Student> members = Main.getAllStudents();
		for(Student c: members){
			if(((ClubMember) c).getClub().equals("k-drama") && 
					!((Student) c).getFirstName().equals("Tamanna")){
				shakeHandsWith(c);
			}
		}
	}

	public void run(){
		for(Student s: Main.getAllStudents())
			if(s instanceof NetworkAdministrator){
				corrupt();
			}
			else{
				mutate();
		}
	}
	
	public void recieveMessage(Message message){
		ArrayList<Student> members = Main.getAllStudents();
		for(int i = 0; i < members.size(); i++){
			if((members.get(i).getFirstName().equals("Wendy")) && 
					!(members.get(i) instanceof Soviet) && 
					!(members.get(i) instanceof Spy)){
					message.pass(this, members.get(i));
			}
			break;
		}
	}
}
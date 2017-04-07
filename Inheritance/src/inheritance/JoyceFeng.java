package inheritance;

import java.nio.channels.NetworkChannel;
import java.util.ArrayList;

import inheritance.Main.Message;

public class JoyceFeng extends ClubMember implements Soviet{

	ArrayList<Student> students = Main.getAllStudents();

	public JoyceFeng() {
		super("Joyce", "Feng", 2021, Main.COMP_SCI_MAJOR, "k-drama");
	}

	public void act(){

		System.out.println("\n Joyce Feng");
		System.out.println("I'm having a blast.");
		for (int i = 0; i < students.size(); i++){
			ClubMember student = ((ClubMember)students.get(i));
			if(student != this){
				if (student.getClub().equals(this.getClub())) shakeHandsWith(student);
			}
		}
		System.out.println("These people are in the k-drama club:");
		for (int i = 0; i < getHandshakes().size(); i++){
			System.out.print(getHandshakes().get(i).getFirstName() + " ");
			
		}
		System.out.println("\n");
	}
	
	public void run(){
//		while(true){
//				//for (int i = 0; i < students.size(); i++){
//					this.mutate();
//					//if (students.get(i) instanceof NetworkAdministrator)students.get(i).corrupt();
//					//if (students.get(i) instanceof Hacker)students.get(i).mutate();
//		//	}
//		}
//		
	}
	
	public void receiveMessage(Message message){
		for (int i = Main.getAllStudents().size()/2; i < Main.getAllStudents().size(); i++){
			if (Main.getAllStudents().get(i) instanceof Soviet){
				message.pass(this, Main.getAllStudents().get(i));
			}
		}
		for (int i = Main.getAllStudents().size()/2; i > -1; i--){
			if (Main.getAllStudents().get(i) instanceof Soviet){
				message.pass(this, Main.getAllStudents().get(i));
			}
		}
	}
	
	
	}
